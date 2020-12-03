package com.example.comercy.service;

import com.example.comercy.controller.model.PagamentoDTO;
import com.example.comercy.model.pagamentos.*;

public class PagamentoCreator {

    public static Pagamento criaPagamento(PagamentoDTO pagamento) {
        switch (pagamento.getType()) {
            case "credito":
                return new PagamentoCredito();
            case "debito":
                return new PagamentoDebito();
            case "dinheiro":
                return new Pagamentodinheiro();
            case "pix":
                return new PagamentoPix();
        }
        return null;
    }
}
