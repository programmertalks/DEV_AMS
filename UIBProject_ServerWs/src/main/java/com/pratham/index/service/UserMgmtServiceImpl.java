package com.pratham.index.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratham.index.model.UserMaster;
import com.pratham.index.repository.UserMgmtRepository;

@Service
public class UserMgmtServiceImpl implements UserMgmtService {
	
	@Autowired
	private UserMgmtRepository userMgmtRepository;

	@Override
	public Object saveUser(UserMaster userMaster) {
		
		return userMgmtRepository.save(userMaster);
	}

}
