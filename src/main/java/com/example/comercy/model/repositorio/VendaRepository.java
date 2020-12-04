package com.example.comercy.model.repositorio;

import com.example.comercy.model.vendas.Venda;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendaRepository extends MongoRepository<Venda, String> {

}
