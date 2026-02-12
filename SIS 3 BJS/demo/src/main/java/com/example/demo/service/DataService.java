package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class DataService {

    private final RestTemplate restTemplate;

    public DataService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map<String, Object> fetchData() {

        String url = "https://catfact.ninja/fact";

        Map response = restTemplate.getForObject(url, Map.class);

        return Map.of(
                "source", "external-api",
                "value", response.get("fact")
        );
    }
}
