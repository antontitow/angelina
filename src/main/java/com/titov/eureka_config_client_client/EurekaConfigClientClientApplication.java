package com.titov.eureka_config_client_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class EurekaConfigClientClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConfigClientClientApplication.class, args);
	}

}
