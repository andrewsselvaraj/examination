package com.cloud.examination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class ExaminationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExaminationApplication.class, args);
	}

}
