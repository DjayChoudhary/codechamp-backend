package com.codeispassion.codechamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CodechampApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodechampApplication.class, args);

	}

}
