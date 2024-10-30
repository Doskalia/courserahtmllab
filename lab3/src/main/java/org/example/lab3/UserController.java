package org.example.lab3;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Min;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
@Validated
public class UserController {

    private Map<Long, Map<String, Object>> users = new HashMap<>();

    @PutMapping("/{id}/update")
    public ResponseEntity<Map<String, Object>> updateUser(@PathVariable Long id, @RequestBody Map<String, Object> updates) {
        Map<String, Object> user = users.get(id);
        if (user != null) {
            user.putAll(updates);
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(404).body(null);
        }
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        if (users.remove(id) != null) {
            return ResponseEntity.ok("User deleted successfully");
        } else {
            return ResponseEntity.status(404).body("User not found");
        }
    }

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@Valid @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok("User created successfully");
    }

    public static class UserDTO {

        @NotEmpty(message = "Name must not be empty")
        private String name;

        @Min(value = 18, message = "Age must be greater than or equal to 18")
        private int age;

        // Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}

