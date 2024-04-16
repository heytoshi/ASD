package edu.miu.cs489.tsogt.lab_9;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab9Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab9Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner() {
        return (args) -> {
            System.out.println("Hello RESTful Web API");
            System.out.println("Lab_9 WebAPI server. Starting...");
            System.out.println("Lab_9 WebAPI server. Started.\nRunning Apache Tomcat service and Listening for HTTP Request on Port number, 8080");
        };
    }
}
