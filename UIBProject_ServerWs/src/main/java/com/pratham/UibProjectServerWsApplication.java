package com.pratham;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.pratham.util.UibAuditAware;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware" )
public class UibProjectServerWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UibProjectServerWsApplication.class, args);
		System.out.println("Done");
	}
	
	@Bean
	public AuditorAware<String> auditorAware(){
		
		return new UibAuditAware();
	}

}
