package com.example.comercy.service;

import com.example.comercy.model.repositorio.ItemRepository;
import com.example.comercy.model.vendas.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository repository;

    public Item add(Item item) {
        Item inserted = repository.insert(item);
        return inserted;
    }

    public boolean delete(String id) {
        boolean exists = repository.existsById(id);
        if (exists) {
            repository.deleteById(id);
        }
        return exists;
    }

    public List<Item> findAll() {
        return repository.findAll();
    }

}
