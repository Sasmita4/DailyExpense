package com.daily.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ImportResource({"classpath:mongo-context.xml"})
@ComponentScan(basePackages={"com.daily"})
public class Application {
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}
