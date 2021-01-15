package com.mytona.Portalcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PortalCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalCustomerApplication.class, args);
	}

}
