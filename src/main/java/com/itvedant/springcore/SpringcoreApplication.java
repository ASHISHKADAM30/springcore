package com.itvedant.springcore;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.itvedant.*"})
public class SpringcoreApplication implements CommandLineRunner{
	@Autowired
	Employee employee; //injection

	@Autowired
	LocalDate date;

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employee.working();
		System.out.println("Today is " + date);
	}
}
