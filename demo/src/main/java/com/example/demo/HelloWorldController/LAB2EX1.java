package com.example.demo.HelloWorldController.LAB2EX1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class LAB2EX1 {

    @GetMapping("/currenttime")
    public String getCurrentTime() {

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return "current time: " + currentTime.format(formatter);
    }
}