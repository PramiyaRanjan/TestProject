package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		CongigurebleApplicationContext run = SpringApplication.run(TestProjectApplication.class, args);

                run.close();
	}

}
