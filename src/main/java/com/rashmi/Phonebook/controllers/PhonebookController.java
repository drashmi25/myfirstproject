package com.rashmi.Phonebook.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/phonebook")
public class PhonebookController {

    @GetMapping

    public String phoneBook(Model viewModel){
        viewModel.addAttribute("pageTitle","Phone Book");
        return "phonebook";
    }


}
