package com.example.BEST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BestApplication.class, args);
	}

}
