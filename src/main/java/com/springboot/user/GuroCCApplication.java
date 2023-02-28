package com.springboot.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.springboot"})
@SpringBootApplication
public class GuroCCApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuroCCApplication.class, args);
		
		System.out.println("====== 시작 =======");
	}

}

