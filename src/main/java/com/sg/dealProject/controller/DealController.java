/**
 * 
 */
package com.sg.dealProject.controller;

import com.sg.dealProject.exception.DealException;
import com.sg.dealProject.model.DealObject;
import com.sg.dealProject.service.DealService;

/**
 * @author Anoop
 *
 */
@RestController
@RequestMapping(value = "/api", produces = "application/hal+json")
public class DealController {
	// public static final Logger logger =
	// LoggerFactory.getLogger(DealController.class);

	@Autowired
	DealService dealService;

	@RequestMapping(value = "/deal/", method = RequestMethod.POST)
	public ResponseEntity<?> createDeal(@RequestBody DealObject dealObject) {
		// logger.info("Creating deal : {}", dealObject);

		if (dealService.doesDealExist(dealObject.getCode())) {

			// logger.error("Unable to create a deal with name {} already exist",
			// dealObject.getName());

			return new ResponseEntity(
					new DealException("Unable to create a deal with name " + dealObject.getName() + " already exist."),
					HttpStatus.CONFLICT);
		}
		dealService.createDeal(dealObject);

		//HttpHeaders headers = new HttpHeaders();
		//headers.setLocation("/api/deal/{id}".buildAndExpand(dealObject.getCode())).toUri());
		
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/deal/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getDeal(@PathVariable("id") long id) {
		// logger.info(" fetching deal with id {}", id);

		DealObject dealObject = dealService.retrieveDeal(id);

		if (dealObject == null) {
			// logger.error("User with id {} not found.", id);
			return new ResponseEntity(new DealException("deal with id " + id + " not found"), HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<DealObject>(dealObject, HttpStatus.OK);
	}
}
