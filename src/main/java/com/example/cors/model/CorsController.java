package com.example.cors.model;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CorsController {

    @GetMapping("/reverse")
    @CrossOrigin(origins = "http://localhost:8080")
    public String reverseName(@RequestParam String name) {
        return new StringBuilder(name).reverse().toString();
    }

    @PostMapping("/reverse")
    @CrossOrigin(origins = "http://localhost:8080")
    public String reverseNamePost(@RequestParam String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
