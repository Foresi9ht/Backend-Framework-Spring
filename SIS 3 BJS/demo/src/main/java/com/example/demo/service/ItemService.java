package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public Item save(Item item) {
        return repository.save(item);
    }

    public List<Item> findAll() {
        return repository.findAll();
    }
}
