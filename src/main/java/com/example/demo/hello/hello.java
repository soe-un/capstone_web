package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hello {

    @GetMapping("/test")
    public String hello(){
        return "Hello demo world";
    }

}
