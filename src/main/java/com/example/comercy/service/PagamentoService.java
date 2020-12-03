package com.example.comercy.service;

import com.example.comercy.controller.dto.PagamentoDTO;
import com.example.comercy.model.pagamentos.Pagamento;
import com.example.comercy.model.repositorio.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    PagamentoRepository repository;

    public Pagamento processarPagamento(PagamentoDTO pagamento) {
        Pagamento pagamentoProcessado = PagamentoCreator.pagamentoFactoryMethod(pagamento);

        if (pagamentoProcessado.autorizaPagamento()){
            pagamentoProcessado.efetuaPagamento();
            return repository.insert(pagamentoProcessado);
        }

        return null;
    }
}


