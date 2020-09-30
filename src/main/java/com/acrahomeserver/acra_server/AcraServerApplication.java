package com.acrahomeserver.acra_server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AcraServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcraServerApplication.class, args);
	}

}
