package com.titov.eureka_config_client_client;

import com.titov.eureka_config_client_client.certs.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class EurekaConfigClientClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaConfigClientClientApplication.class, args);
	}

}
