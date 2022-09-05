package com.ms.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringMsOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsOneApplication.class, args);
	}
}
