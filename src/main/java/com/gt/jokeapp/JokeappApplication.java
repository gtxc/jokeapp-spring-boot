package com.gt.jokeapp;

import com.gt.jokeapp.services.JokeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokeappApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(JokeappApplication.class, args);
    }
}
