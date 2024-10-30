package org.example.lab3gradle;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
@Validated
public class UserValidationController {

    @PostMapping("/create/validated")
    public ResponseEntity<String> createValidatedUser(@Valid @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok("Validated user created successfully");
    }

    public static class UserDTO {

        @NotEmpty(message = "Name must not be empty")
        private String name;

        @Min(value = 18, message = "Age must be greater than or equal to 18")
        private int age;

        // Getters и setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
