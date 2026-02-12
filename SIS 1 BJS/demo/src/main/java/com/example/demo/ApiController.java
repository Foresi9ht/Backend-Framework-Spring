package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    // GET endpoint
    @GetMapping("/info")
    public Map<String, Object> getInfo() {
        return Map.of(
                "student", "Sultik",  // напиши своё имя если нужно
                "course", "Spring Framework",
                "week", 1
        );
    }

    // POST endpoint
    @PostMapping("/calculate")
    public Map<String, Integer> calculate(@RequestBody Map<String, Integer> body) {

        int a = body.get("a");
        int b = body.get("b");

        int result = a + b; // сложение

        return Map.of("result", result);
    }
}
