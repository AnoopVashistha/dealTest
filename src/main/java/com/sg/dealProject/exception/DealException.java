/**
 * 
 */
package com.sg.dealProject.exception;

/**
 * @author Anoop
 *
 */
public class DealException {
	private String errorMessage;
	 
    public DealException(String errorMessage){
        this.errorMessage = errorMessage;
    }
 
    public String getErrorMessage() {
        return errorMessage;
    }
}
