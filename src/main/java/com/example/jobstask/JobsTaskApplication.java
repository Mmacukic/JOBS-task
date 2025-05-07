package com.example.jobstask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class JobsTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobsTaskApplication.class, args);
    }

}
