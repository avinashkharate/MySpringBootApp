package com.example.MySpringBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello... , This Jar Was packaged by jenkins Server ";
    }

    @GetMapping("/hello-aws")
    public String helloAws(){
        return "------Hello Sejal , This is AWS-DEMO for EC2--------";
    }
}
