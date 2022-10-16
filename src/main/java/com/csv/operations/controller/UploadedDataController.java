/**
 * 
 */
package com.csv.operations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.csv.operations.entity.DataFromFile;
import com.csv.operations.service.UploadedDataService;

/**
 * @author Ajay Sarvasiddhi
 *
 */
@RestController
@RequestMapping("/data")
public class UploadedDataController {

	@Autowired
	private UploadedDataService uploadedDataService;

	@GetMapping("/code/{code}")
	public @ResponseBody ResponseEntity<Object> getRecordByCode(@PathVariable String code) {
		try {
			return new ResponseEntity<>(uploadedDataService.getRecordByCode(code), HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/fetch/all")
	public @ResponseBody ResponseEntity<List<DataFromFile>> getAllRecords() {
		return new ResponseEntity<>(uploadedDataService.getAllRecords(), HttpStatus.OK);
	}

	@DeleteMapping("/delete/all")
	public @ResponseBody ResponseEntity<Object> deleteAllRecords() {
		uploadedDataService.deleteAll();
		return new ResponseEntity<>("Deleted all data", HttpStatus.OK);
	}
	
	
}
