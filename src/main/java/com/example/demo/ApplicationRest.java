package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationRest {

    @GetMapping("/")
    public String test(){
        return "Hello World!!";
    }
}
