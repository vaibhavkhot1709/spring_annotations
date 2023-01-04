package com.spring.annotation.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.annotation.qualifier")
public class MyVillageConfig {

	@Bean
	public Address getAddress() {

		return new Address(416213, "Bamavade", "Maharashtra");
	}

}
