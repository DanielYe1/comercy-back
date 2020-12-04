package com.example.comercy.service;

import com.example.comercy.model.pagamentos.NotaFiscal;
import com.example.comercy.model.pagamentos.Pagamento;
import com.example.comercy.model.repositorio.VendaRepository;
import com.example.comercy.model.vendas.Venda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class VendaService {

    @Autowired
    VendaRepository repository;

    public Venda processarVenda(String idCliente, Map<String, Integer> itens, Pagamento pagamento, NotaFiscal notaFiscal) {
        Venda venda = new Venda(idCliente, itens, pagamento, notaFiscal);
        return repository.insert(venda);
    }
}
