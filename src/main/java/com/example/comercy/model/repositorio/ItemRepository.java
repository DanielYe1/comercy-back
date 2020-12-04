package com.example.comercy.model.repositorio;

import com.example.comercy.model.vendas.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {
    Integer getPrecoById(String id);
}
