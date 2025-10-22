package com.raunak.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AppApplication.class, args);
		dev obj = context.getBean(dev.class);
		obj.build();	



	}

}
