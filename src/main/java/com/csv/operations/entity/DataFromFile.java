/**
 * 
 */
package com.csv.operations.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Ajay Sarvasiddhi
 *
 */
@Entity
@Table(name = "UPLOAD_DATA")
public class DataFromFile {

	@Id
	@JsonIgnore
	private int id;

	@Column(name = "source")
	private String source;

	@Column(name = "codeList")
	private String codeList;

	@Column(name = "code", unique = true)	
	private String code;

	@Column(name = "displayValue")
	private String displayValue;

	@Column(name = "longDescription")
	private String longDescription;

	@Column(name = "fromDate")
	private String fromDate;

	@Column(name = "toDate")
	private String toDate;

	@Column(name = "sortingPriority")
	private int sortingPriority;

	public DataFromFile() {

	}

	public DataFromFile(String source, String codeList, String code, String displayValue, String longDescription,
			String fromDate, String toDate, int sortingPriority) {
		this.source = source;
		this.codeList = codeList;
		this.code = code;
		this.displayValue = displayValue;
		this.longDescription = longDescription;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.sortingPriority = sortingPriority;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCodeList() {
		return codeList;
	}

	public void setCodeList(String codeList) {
		this.codeList = codeList;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDisplayValue() {
		return displayValue;
	}

	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public int getSortingPriority() {
		return sortingPriority;
	}

	public void setSortingPriority(int sortingPriority) {
		this.sortingPriority = sortingPriority;
	}

}
