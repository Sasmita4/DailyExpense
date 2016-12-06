package com.daily.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
//@ImportResource({"classpath:mongo-context.xml"})
/*@ImportResource({"classpath:tiles.xml"})
*/
@ImportResource({"classpath:applicationUrlContext.xml"})
@ComponentScan(basePackages={"com.daily"})
public class Application extends WebMvcConfigurerAdapter{
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}
