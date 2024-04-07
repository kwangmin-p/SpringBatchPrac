package com.fastcampus.springbatch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@EnableBatchProcessing
@SpringBootApplication
public class SpringBatchPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchPracApplication.class, args);
	}

}
