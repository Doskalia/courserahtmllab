package com.example.demo.HelloWorldController.LAB2EX2V2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LAB2EX2V2 {

    @GetMapping("/numbersv2")
    public int[] getNumbers(@RequestParam(value = "n", defaultValue = "10") int n) {
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
