/**
 * 
 */
package com.csv.operations.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csv.operations.entity.DataFromFile;
import com.csv.operations.repository.UploadedDataRepository;

/**
 * @author Ajay Sarvasiddhi
 *
 */
@Service
public class UploadedDataServiceImpl implements UploadedDataService {

	@Autowired
	private UploadedDataRepository uploadedDataRepository;

	public List<DataFromFile> getAllRecords() {
		return uploadedDataRepository.findAll();
	}
	
	public DataFromFile getRecordByCode(String code) throws EntityNotFoundException {
		return uploadedDataRepository.getRecordByCode(code);
	}

	public void deleteAll() {
		uploadedDataRepository.deleteAll();
	}
	
}
