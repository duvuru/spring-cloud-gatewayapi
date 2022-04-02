package com.ragainfotech.gatewayapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudGatewayapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayapiApplication.class, args);
	}

}
