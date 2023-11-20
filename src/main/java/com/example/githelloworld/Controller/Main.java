package com.example.githelloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @GetMapping("/")
    public String helloworld()
    {
        return "hello user";
    }
}
