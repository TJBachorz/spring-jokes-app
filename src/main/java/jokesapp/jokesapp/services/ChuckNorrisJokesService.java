package jokesapp.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokesService implements JokesService {

    private final String randomChuckNorrisJoke = new ChuckNorrisQuotes().getRandomQuote();

    @Override
    public String tellJoke() {
        return randomChuckNorrisJoke;
    }
}
