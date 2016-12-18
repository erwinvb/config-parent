package com.example.config.client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient2Application.class, args);
	}

	@RestController
	public static class ClientResource {

//		@Value("${shared.property}")
//		private String shared;

		@Value("${client.name}")
		private String name;
//
//		@GetMapping("/shared")
//		public String shared() {
//			return shared;
//		}

		@GetMapping("/name")
		public String name() {
			return name;
		}
	}
}
