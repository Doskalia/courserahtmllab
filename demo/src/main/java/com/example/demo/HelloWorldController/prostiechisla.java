
package com.example.demo.HelloWorldController.prostiechisla;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class prostiechisla {

    @GetMapping("/nums")
    public int[] getPrimeNumbers(@RequestParam(value = "n", defaultValue = "10") int n) {
        int limit = 100;
        int[] primeNumbers = new int[limit];
        int count = 0;
        int num = n;

        while (count < limit) {
            if (isPrime(num)) {
                primeNumbers[count] = num;
                count++;
            }
            num++;
        }

        return primeNumbers;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
