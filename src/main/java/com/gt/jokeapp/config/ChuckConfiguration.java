package com.gt.jokeapp.config;

/*
    Created by gurk at 10:13 on Tuesday, June 15, 2021.
    Project: jokeapp, Package: com.gt.jokeapp.config.
*/

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
