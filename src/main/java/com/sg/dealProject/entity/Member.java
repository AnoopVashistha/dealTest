/**
 * 
 */
package com.sg.dealProject.entity;

/**
 * @author Anoop
 *
 */
@Entity
@Table(name = "facility")
public class Member {
	String name;

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
	
	
	
	

}
