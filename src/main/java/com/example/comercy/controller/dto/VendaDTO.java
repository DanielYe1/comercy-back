package com.example.comercy.controller.dto;

import java.util.Map;

//DTO
public class VendaDTO {
    private String idCliente;
    private Map<String,Integer> itens;
    private PagamentoDTO pagamento;

    public String getIdCliente() {
        return idCliente;
    }

    public Map<String, Integer> getItens() {
        return itens;
    }

    public PagamentoDTO getPagamento() {
        return pagamento;
    }
}
