package com.pratham.util;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class Auditable {
	
	@CreatedDate
	private Date createdOn;
	
	@CreatedBy
	private String createdBy;
	
	@LastModifiedDate
	private Date updatedOn;
	
	@LastModifiedBy
	private String updatedBy;

}
