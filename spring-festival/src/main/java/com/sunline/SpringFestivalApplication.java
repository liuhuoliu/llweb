package com.sunline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sunline.mapper")
public class SpringFestivalApplication {

	public static void main(String[] args) {
//		System.setProperty("spring.devtools.restart.enabled", "false");
		System.out.println("The service to start.");
		SpringApplication.run(SpringFestivalApplication.class, args);
		System.out.println("The service has started.");
	}

}

