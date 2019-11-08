package com.sg.dealProject.entity;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "deal")
public class Deal {
	@Id
    private long code;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	name
	private BigDecimal amount;
	
	private List<Member> dealTeamMembers;
	
	private List<Facility> facilities;
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
	public List<Member> getDealTeamMembers() {
		return dealTeamMembers;
	}
	/**
	 * @param dealTeamMembers the dealTeamMembers to set
	 */
	public void setDealTeamMembers(List<Member> dealTeamMembers) {
		this.dealTeamMembers = dealTeamMembers;
	}
	/**
	 * @return the facilities
	 */
	public List<Facility> getFacilities() {
		return facilities;
	}
	/**
	 * @param facilities the facilities to set
	 */
	public void setFacilities(List<Facility> facilities) {
		this.facilities = facilities;
	}
	
	
	
	

}
