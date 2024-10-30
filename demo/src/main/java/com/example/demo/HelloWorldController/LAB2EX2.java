package com.example.demo.HelloWorldController.LAB2EX2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class LAB2EX2 {

    @GetMapping("/numbers")
    public List<Integer> getNumbers(@RequestParam(value = "n", defaultValue = "10") int n) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        return numbers;
    }
}
