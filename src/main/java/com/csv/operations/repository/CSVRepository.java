/**
 * 
 */
package com.csv.operations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csv.operations.entity.DataFromFile;

/**
 * @author Ajay Sarvasiddhi
 *
 */
public interface CSVRepository  extends JpaRepository<DataFromFile, String>{

}
