package com.zaurtregulov.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zaurtregulov.spring.cfg")
@ComponentScan("com.zaurtregulov.spring.services")
@ComponentScan("com.zaurtregulov.spring.repositories")
public class HotelApplication {
    public static void main(String[] args) {
        SpringApplication.run(HotelApplication.class, args);
    }
}
