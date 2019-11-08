/**
 * 
 */
package com.sg.dealProject.service;

import com.sg.dealProject.entity.Facility;
import com.sg.dealProject.model.DealObject;

/**
 * @author Anoop
 *
 */
public interface DealService {

	DealObject createDeal(DealObject deal);

	DealObject retrieveDeal(Long dealID);

	DealObject updateDeal(DealObject deal);

	Facility addFacility(Long dealID, Facility facility);

	boolean doesDealExist(Long dealID);
}
