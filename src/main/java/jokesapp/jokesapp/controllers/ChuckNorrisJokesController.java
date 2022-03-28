package jokesapp.jokesapp.controllers;

import jokesapp.jokesapp.services.ChuckNorrisJokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokesController {

    private final ChuckNorrisJokesService chuckNorrisJokesService;

    public ChuckNorrisJokesController(ChuckNorrisJokesService chuckNorrisJokesService) {
        this.chuckNorrisJokesService = chuckNorrisJokesService;
    }

    @RequestMapping({ "/", ""})
    public String tellChuckNorrisJoke(Model model) {
        model.addAttribute("joke", chuckNorrisJokesService.tellJoke());

        return "index";
    }
}
