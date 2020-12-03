package com.example.comercy.model.repositorio;

import com.example.comercy.model.pagamentos.Pagamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PagamentoRepository extends MongoRepository<Pagamento, String> {

}
