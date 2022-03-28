package com.basic.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
public class ResolverClass {

	
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolve = new InternalResourceViewResolver();
		resolve.setPrefix(null);
		resolve.setSuffix(null);
		return resolve;
	}
	
}
