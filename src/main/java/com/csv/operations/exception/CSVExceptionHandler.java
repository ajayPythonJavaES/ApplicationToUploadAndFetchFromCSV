/**
 * 
 */
package com.csv.operations.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Ajay Sarvasiddhi
 *
 */
@ControllerAdvice
public class CSVExceptionHandler {

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException ex) {
		ApiException apiException = new ApiException(HttpStatus.NOT_FOUND);
		apiException.setDebugMessage(ex.getLocalizedMessage());
		apiException.setMessage(ex.getMessage());
		return buildResponseEntity(apiException);
	}
	
	@ExceptionHandler(FileFormatException.class)
	public ResponseEntity<Object> handleFileFormatNotSupported(FileFormatException ex) {
		ApiException apiException = new ApiException(HttpStatus.NOT_ACCEPTABLE);
		apiException.setDebugMessage(ex.getLocalizedMessage());
		apiException.setMessage(ex.getMessage());
		return buildResponseEntity(apiException);
	}
	
	private ResponseEntity<Object> buildResponseEntity(ApiException apiException) {
		return new ResponseEntity<>(apiException, apiException.getStatus());
	}
}
