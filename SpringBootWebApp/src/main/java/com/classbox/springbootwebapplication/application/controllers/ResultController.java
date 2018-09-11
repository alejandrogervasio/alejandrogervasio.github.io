package com.classbox.springbootwebapplication.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultController {

    @GetMapping("/home")
    public String showResults(Model model) {
        String name = (String) model.asMap().get("name");
        model.addAttribute("name", name);
        return "results";
    }
}
