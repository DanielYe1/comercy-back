package com.example.comercy.controller.dto;

// DTO
public class PagamentoDTO {
    private String type;
    private String chave;
    private String numeroCartao;
    private Integer valorRecebido;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Integer getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(Integer valorRecebido) {
        this.valorRecebido = valorRecebido;
    }
}
