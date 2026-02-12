package com.example.demo.controller;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService service;

    public ItemController(ItemService service) {
        this.service = service;
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return service.save(item);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return service.findAll();
    }
}
