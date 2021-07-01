package com.microservice.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer 
@SpringBootApplication
public class MicroserviceDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDashboardApplication.class, args);
	}

}
