package com.rohan.springjokesapp.controller;

import com.rohan.springjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJokes(Model model){
        model.addAttribute("jokes", jokeService.getJoke());
        return "jokes/index";
    }
}
