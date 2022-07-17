package com.hillel.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class IndexController {

    @GetMapping
    public String getHomePage(Model model) {
        //model.addAttribute(name, value);
        return "index";
    }
}
