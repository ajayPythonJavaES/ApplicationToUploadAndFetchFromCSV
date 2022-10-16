/**
 * 
 */
package com.csv.operations.exception;

/**
 * @author Ajay Sarvasiddhi
 *
 */
public class FileFormatException extends Exception {

	private static final long serialVersionUID = -1L;
	private String excMessage;

	public FileFormatException(String message) {
		this.excMessage = message;
	}

	@Override
	public String toString() {
		return excMessage;
	}

}
