package com.huyquang2601.ex5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "IT209 Session 11 - Exercise 5";
    }
}
