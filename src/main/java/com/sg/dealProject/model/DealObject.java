/**
 * 
 */
package com.sg.dealProject.model;

import java.math.BigDecimal;
import java.util.List;

import com.sg.dealProject.entity.Facility;
import com.sg.dealProject.entity.Members;

/**
 * @author Anoop
 *
 */
public class DealObject {

	private long code;
	private String name;
	private BigDecimal amount;
	private List<MemberObject> dealTeamMembers;
	private List<FacilityObject> facilities;

	/**
	 * @return the code
	 */
	public long getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(long code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the dealTeamMembers
	 */
	public List<MemberObject> getDealTeamMembers() {
		return dealTeamMembers;
	}

	/**
	 * @param dealTeamMembers the dealTeamMembers to set
	 */
	public void setDealTeamMembers(List<MemberObject> dealTeamMembers) {
		this.dealTeamMembers = dealTeamMembers;
	}

	/**
	 * @return the facilities
	 */
	public List<FacilityObject> getFacilities() {
		return facilities;
	}

	/**
	 * @param facilities the facilities to set
	 */
	public void setFacilities(List<FacilityObject> facilities) {
		this.facilities = facilities;
	}

}
