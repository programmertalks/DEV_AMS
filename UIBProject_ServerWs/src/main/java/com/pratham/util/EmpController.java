package com.pratham.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/emp")
public class EmpController {

	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@RequestMapping(method = RequestMethod.POST,headers = "accept=application/json")
	public Object saveEmp(@RequestBody Employee employee) {
		
		return employeeRepo.save(employee);
	
	}
	
}
