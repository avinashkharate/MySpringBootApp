package com.example.MySpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello")
    public String Hello(){
        return "hello-jar";
    }

    @GetMapping("/hello-aws")
    public String helloAws(){
        return "hello-aws";
    }
}
