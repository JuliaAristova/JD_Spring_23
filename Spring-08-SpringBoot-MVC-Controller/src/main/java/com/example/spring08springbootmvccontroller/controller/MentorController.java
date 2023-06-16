package com.example.spring08springbootmvccontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {

//if we put the same end point (/show - Student -
//error - ambigious mapping - IllegalStateException
    //to avoid - RequestMapping on class level
    @GetMapping("/show")
    public String showForm() {
        return "home";
    }
}
