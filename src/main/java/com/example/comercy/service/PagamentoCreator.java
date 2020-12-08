package com.example.comercy.service;

import com.example.comercy.controller.dto.PagamentoDTO;
import com.example.comercy.model.pagamentos.*;

public class PagamentoCreator {

    //Factory method
    public static Pagamento pagamentoFactoryMethod(PagamentoDTO pagamento) {
        switch (pagamento.getType()) {
            case "credito":
                return new PagamentoCredito(pagamento.getTotal(), pagamento.getType(), pagamento.getNumeroCartao());
            case "debito":
                return new PagamentoDebito(pagamento.getTotal(), pagamento.getType(), pagamento.getNumeroCartao());
            case "dinheiro":
                return new PagamentoDinheiro(pagamento.getTotal(), pagamento.getType(), pagamento.getValorRecebido());
            case "pix":
                return new PagamentoPix(pagamento.getTotal(), pagamento.getType(), pagamento.getChave());
        }
        return null;
    }
}
