package com.example.demo;

import com.example.demo.service.DataService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final DataService dataService;

    public ApiController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/info")
    public Map<String, Object> getInfo() {
        return Map.of(
                "student", "Sultik",
                "course", "Spring Framework",
                "week", 1
        );
    }

    @PostMapping("/calculate")
    public Map<String, Integer> calculate(@RequestBody Map<String, Integer> body) {

        int a = body.get("a");
        int b = body.get("b");

        int result = a + b;

        return Map.of("result", result);
    }
    @GetMapping("/data")
    public Map<String, Object> getData() {
        return dataService.fetchData();
    }
}
