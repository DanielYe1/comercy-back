package com.example.comercy.model.pessoas;

public class ClientePreferencial extends Cliente {

    private Integer quantidadeDePontos;

    public ClientePreferencial(String id, Integer quantidadeDePontos) {
        super(id);
        this.quantidadeDePontos = quantidadeDePontos;
    }

    public boolean isPreferencial(String cpf) {
        return true;
    }

    public void aumentaPontosPorCompra(Integer valorDaCompra) {
        this.quantidadeDePontos += valorDaCompra;
    }

    public Integer retiraDescontoPorPontos(Integer valorDaCompra) {
        if (this.quantidadeDePontos >= valorDaCompra) {
            this.quantidadeDePontos -= valorDaCompra;
            return valorDaCompra;
        }
        this.quantidadeDePontos -= valorDaCompra;
        return valorDaCompra - this.quantidadeDePontos;
    }
}
