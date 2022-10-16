/**
 * 
 */
package com.csv.operations.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Ajay Sarvasiddhi
 *
 */
public interface UploadService {

	public void save(MultipartFile file) throws Exception;
	
}
