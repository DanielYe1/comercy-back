package com.example.comercy.service;

import com.example.comercy.controller.dto.PagamentoDTO;
import com.example.comercy.model.pagamentos.*;

public class PagamentoCreator {

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
