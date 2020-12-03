package com.example.comercy.service;

import com.example.comercy.controller.model.PagamentoDTO;
import com.example.comercy.model.repositorio.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {

    @Autowired
    PagamentoRepository repository;

    public void processarPagamento(PagamentoDTO pagamento) {
        PagamentoCreator.criaPagamento(pagamento);
    }
}


