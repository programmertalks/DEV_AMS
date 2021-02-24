package com.pratham.util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.pratham.master.StringPrefixedSequenceIdGenerator;

@Entity
@Table(name="emp_tab")
public class Employee extends Auditable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "emp_seq")
	@GenericGenerator(name = "emp_seq", strategy = "com.pratham.master.StringPrefixedSequenceIdGenerator",parameters = {
		@Parameter(name= StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value = "50"),
		@Parameter(name= StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value= "UIB-"),
		@Parameter(name= StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value= "%d")
	})
	private String empId; 
	private String empName;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	

}