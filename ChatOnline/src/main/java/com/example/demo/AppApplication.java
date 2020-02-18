package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.example.demo.dao.mappers")
public class AppApplication  extends SpringBootServletInitializer {
	
	/**
	 * 打成war包需要重写方法
	 */
	/*protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(new Class[] { AppApplication.class });
	}*/


	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
}
