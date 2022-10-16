/**
 * 
 */
package com.csv.operations.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.csv.operations.entity.DataFromFile;

/**
 * @author Ajay Sarvasiddhi
 *
 */
public interface UploadedDataService {

	public DataFromFile getRecordByCode(String code) throws EntityNotFoundException;
	
	public List<DataFromFile> getAllRecords();
	
	public void deleteAll();
}
