package com.omorales.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAA"); 
		System.out.println(Thread.currentThread().getName());
	
	}

}
