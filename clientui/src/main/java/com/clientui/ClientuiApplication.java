package com.clientui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.clientui")
public class ClientuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientuiApplication.class, args);
	}

}
