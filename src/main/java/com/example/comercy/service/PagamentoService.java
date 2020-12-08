package com.example.comercy.service;

import com.example.comercy.controller.dto.PagamentoDTO;
import com.example.comercy.model.pagamentos.*;
import com.example.comercy.model.repositorio.ItemRepository;
import com.example.comercy.model.vendas.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

//pure fabrication
@Service
public class PagamentoService {

    @Autowired
    ItemRepository repository;

    public NotaFiscal gerarNotaFiscal(Map<String, Integer> itens) {
        Integer total = 0;
        for (Map.Entry<String, Integer> entry : itens.entrySet()) {
            total += repository.findFirstByCodigoDeBarras(entry.getKey()).getPreco() * entry.getValue();
        }

        return new NotaFiscal(itens, total);
    }

    public Pagamento processarPagamento(PagamentoDTO pagamento, Integer valorTotal) {
        Pagamento pagamentoProcessado = pagamentoFactoryMethod(pagamento, valorTotal);

        // Polimorfismo
        if (pagamentoProcessado.autorizaPagamento()) {
            pagamentoProcessado.efetuaPagamento();
            return pagamentoProcessado;
        }

        return null;
    }

    //Factory method
    public static Pagamento pagamentoFactoryMethod(PagamentoDTO pagamento, Integer valorTotal) {
        switch (pagamento.getType()) {
            case "credito":
                return new PagamentoCredito(valorTotal, pagamento.getType(), pagamento.getNumeroCartao());
            case "debito":
                return new PagamentoDebito(valorTotal, pagamento.getType(), pagamento.getNumeroCartao());
            case "dinheiro":
                return new PagamentoDinheiro(valorTotal, pagamento.getType(), pagamento.getValorRecebido());
            case "pix":
                return new PagamentoPix(valorTotal, pagamento.getType(), pagamento.getChave());
        }
        return null;
    }
}


