package com.example.demo.HelloWorldController.LAB2EX5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LAB2EX5 {

    @GetMapping("/reversestring")
    public String reverseString() {
        String input = "ZAG GS UTII";
        String reversedString = new StringBuilder(input).reverse().toString();
        return reversedString;
    }
}