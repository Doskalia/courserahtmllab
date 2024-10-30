package org.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/HelloWorld")
    public String HelloWorld() {
        return "Hello World";
    }
}
