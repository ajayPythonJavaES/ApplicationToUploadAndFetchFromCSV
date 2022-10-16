/**
 * 
 */
package com.csv.operations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.csv.operations.entity.DataFromFile;

/**
 * @author Ajay Sarvasiddhi
 *
 */
public interface UploadedDataRepository extends JpaRepository<DataFromFile, String>{

	
	@Query("SELECT u FROM DataFromFile u WHERE u.code = ?1")
	public DataFromFile getRecordByCode(String code);
	
	
}
