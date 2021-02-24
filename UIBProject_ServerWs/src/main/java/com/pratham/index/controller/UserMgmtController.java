package com.pratham.index.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pratham.index.model.UserMaster;
import com.pratham.index.service.UserMgmtService;

@RestController
@RequestMapping(path = "/userMgmt")
public class UserMgmtController {
	
	@Autowired
	private UserMgmtService userMgmtService;
	
	@RequestMapping(method=RequestMethod.POST,value = "/saveUser",headers = "Accept=application/json")
	public Object saveUser(@RequestBody UserMaster userMaster) {
		
		
		return userMgmtService.saveUser(userMaster);
	}

}
