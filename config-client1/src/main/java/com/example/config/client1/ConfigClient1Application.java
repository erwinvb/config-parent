package com.example.config.client1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigClient1Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient1Application.class, args);
    }

    @RestController
    public static class ClientResource {

        public static final Logger LOGGER = LoggerFactory.getLogger(ClientResource.class);

        @Value("${client.name}")
        private String name;

        @GetMapping("/name")
        public String name() {
            LOGGER.debug("received name {}", name);
            return name;
        }
    }
}
