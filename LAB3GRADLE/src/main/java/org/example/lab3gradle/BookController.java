package org.example.lab3gradle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping("/add")
    public ResponseEntity<Map<String, Object>> addBook(@RequestBody Map<String, Object> book) {
        book.put("status", "received");
        return ResponseEntity.ok(book);
    }
}
