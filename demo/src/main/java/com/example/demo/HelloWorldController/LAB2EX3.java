package com.example.demo.HelloWorldController.LAB2EX3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class LAB2EX3 {

    @GetMapping("/randomnum")
    public int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(500) + 1;
    }
}
