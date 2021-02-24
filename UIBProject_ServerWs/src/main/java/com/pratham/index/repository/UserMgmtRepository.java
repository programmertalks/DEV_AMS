package com.pratham.index.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pratham.index.model.UserMaster;

@Repository
public interface UserMgmtRepository extends CrudRepository<UserMaster, Integer>{
	

}
