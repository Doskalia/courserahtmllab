package org.example.lab3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/exception")
    public ResponseEntity<String> throwException() {
        throw new RuntimeException("Test exception");
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        return ResponseEntity.status(500).body("An error occurred: " + ex.getMessage());
    }
}
