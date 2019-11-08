/**
 * 
 */
package com.sg.dealProject.service;

import com.sg.dealProject.entity.Facility;
import com.sg.dealProject.model.DealObject;
import com.sg.dealProject.repo.DealsRepository;

/**
 * @author Anoop
 *
 */
@Service
public class DealServiceImpl implements DealService {

	@Autowired
	DealsRepository dealRepo;

	@Override
	public DealObject createDeal(DealObject deal) {
		// map dealobject to entitiy object
		return null;
	}

	@Override
	public DealObject retrieveDeal(DealObject deal) {
		// fetch object and map and then return
		return null;
	}

	
	@Override
	public boolean doesDealExist(Long dealID) {
		if (null != dealRepo.findById(dealID)) {
			return true;
		}
		return false;
	}

	@Override
	public DealObject retrieveDeal(Long dealID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DealObject updateDeal(DealObject deal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facility addFacility(Long dealID, Facility facility) {
		// TODO Auto-generated method stub
		return null;
	}

}
