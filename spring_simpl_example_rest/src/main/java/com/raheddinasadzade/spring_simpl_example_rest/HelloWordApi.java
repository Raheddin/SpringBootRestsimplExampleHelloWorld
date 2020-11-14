package com.raheddinasadzade.spring_simpl_example_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstmsg")
public class HelloWordApi {
    @GetMapping
    public String hello() {
        return "Hello Word !";
    }
}
