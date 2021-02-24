package com.pratham.util;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;

public class UibAuditAware implements AuditorAware<String> {

	
	@Override
	public Optional<String> getCurrentAuditor() {
		
		return Optional.ofNullable("Shiva").filter(s ->!s.isEmpty());
		
	}
	
}
