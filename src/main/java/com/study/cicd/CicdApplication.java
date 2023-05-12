package com.study.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class CicdApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(CicdApplication.class);
		application.addListeners(new ApplicationPidFileWriter());
		application.run(args);
	}

}
