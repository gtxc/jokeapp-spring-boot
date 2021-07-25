package com.gt.jokeapp.services;

/*
    Created by gurk at 19:54 on Monday, June 14, 2021.
    Project: jokeapp, Package: com.gt.jokeapp.services.
*/


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    // before constructor based injection
//    public JokeServiceImpl() {
//        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
