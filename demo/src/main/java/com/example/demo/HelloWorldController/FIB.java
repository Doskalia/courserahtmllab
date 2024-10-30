

package com.example.demo.HelloWorldController.FIB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FIB {

    @GetMapping("/FIB")
    public int[] getFibonacciSeries(@RequestParam(value = "n", defaultValue = "10") int n) {
        return calculateFibonacciSeries(n);
    }

    public int[] calculateFibonacciSeries(int n) {
        int[] fib = new int[n + 1];
        if (n >= 0) fib[0] = 0;
        if (n >= 1) fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }
}
