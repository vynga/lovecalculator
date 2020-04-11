package com.vidhu.lovecalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class HelloController {


    @GetMapping("/myReg")
    public String index() {
        return "Greetings from Spring Boot!";
    }



}
