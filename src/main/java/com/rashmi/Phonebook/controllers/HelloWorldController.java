package com.rashmi.Phonebook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // Request -> [GET, POST, PUT, PATCH, DELETE]
    @GetMapping

    public String helloWorld(Model viewModel) {
        viewModel.addAttribute("pageTitle", "HW");
        return "helloworld";
    }
}
