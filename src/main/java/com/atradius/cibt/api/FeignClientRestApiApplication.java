package com.atradius.cibt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class FeignClientRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientRestApiApplication.class, args);
	}

}
