package com.classbox.springbootwebapplication.application.controllers;

import com.classbox.springbootwebapplication.application.entities.User;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WebController {
    
    @GetMapping("/")
    public String showForm(User user) {
        return "form";
    }
    
    @PostMapping("/")
    public String checkUserInfo(@Valid User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        
        if (bindingResult.hasErrors()) {
            return "form";
        }
        redirectAttributes.addFlashAttribute("name", user.getName());
        return "redirect:/results";
    }
    
    @GetMapping("/results")
    public String redirect() {
        return "results";
    }
}