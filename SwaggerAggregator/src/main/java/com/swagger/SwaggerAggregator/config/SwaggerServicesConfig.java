package com.swagger.SwaggerAggregator.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "documentation.swagger")
public class SwaggerServicesConfig {
	List<SwaggerService> services;

	public List<SwaggerService> getServices() {
		return services;
	}

	public void setServices(List<SwaggerService> services) {
		this.services = services;
	}
}