package jokesapp.jokesapp.controllers;

import jokesapp.jokesapp.services.ChuckNorrisJokesService;
import org.springframework.stereotype.Controller;

@Controller
public class ChuckNorrisJokesController {

    private final ChuckNorrisJokesService chuckNorrisJokesService;

    public ChuckNorrisJokesController(ChuckNorrisJokesService chuckNorrisJokesService) {
        this.chuckNorrisJokesService = chuckNorrisJokesService;
    }

    public String tellChuckNorrisJoke() {
        return chuckNorrisJokesService.tellJoke();
    }
}
