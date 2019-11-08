/**
 * 
 */
package com.sg.dealProject.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Anoop
 *
 */
@Entity
@Table(name = "facility")
public class Facility {
	private String name;
	private Integer code;
	private BigDecimal amount;
	private List<Client> clients;
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
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
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
	 * @return the clients
	 */
	public List<Client> getClients() {
		return clients;
	}
	/**
	 * @param clients the clients to set
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	
	

}
