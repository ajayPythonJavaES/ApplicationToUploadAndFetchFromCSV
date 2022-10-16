/**
 * 
 */
package com.csv.operations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.csv.operations.service.UploadService;

/**
 * @author Ajay Sarvasiddhi
 *
 */
@RestController
public class UploadCSVController {

	@Autowired
	private UploadService uploadService;
	
	@PostMapping("/upload")
	public @ResponseBody ResponseEntity<String> uploadCSVFile(@RequestParam("file") MultipartFile file) {
		
		try {
			uploadService.save(file);
		} catch(Exception ex) {
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>("File is uploaded", HttpStatus.OK);
	}
	
	
}
