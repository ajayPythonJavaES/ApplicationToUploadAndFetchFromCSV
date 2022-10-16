/**
 * 
 */
package com.csv.operations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.csv.operations.entity.DataFromFile;
import com.csv.operations.exception.FileFormatException;
import com.csv.operations.helper.CSVHelper;
import com.csv.operations.repository.CSVRepository;

/**
 * @author Ajay Sarvasiddhi
 *
 */

@Service
public class UploadServiceImpl implements UploadService {

	@Autowired
	private CSVRepository csvRepository;
	
	public void save(MultipartFile file) throws Exception {
		if(CSVHelper.isCSV(file))
			throw new FileFormatException("File format not supported");
		
		List<DataFromFile> csvEntriesToRecords = CSVHelper.convertCSV(file.getInputStream());
		csvRepository.saveAll(csvEntriesToRecords);
	}

}
