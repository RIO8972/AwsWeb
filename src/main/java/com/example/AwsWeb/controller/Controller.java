package com.example.AwsWeb.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/controller")
    public String contr(){
        return "test";
    }
}
