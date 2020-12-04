package com.example.comercy.model.vendas;

public class Item {
    String id;
    Integer preco;
    Integer quantidade;
    String codigoDeBarras;
    String urlImagem;
    String descricao;

    public Item(Integer preco, Integer quantidade, String codigoDeBarras, String urlImagem, String descricao) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigoDeBarras = codigoDeBarras;
        this.urlImagem = urlImagem;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public Integer getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }
}
