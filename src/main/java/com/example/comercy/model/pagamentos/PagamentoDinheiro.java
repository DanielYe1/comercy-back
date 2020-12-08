package com.example.comercy.model.pagamentos;

public class PagamentoDinheiro extends Pagamento {
    private Integer valorRecebido;
    private Integer troco;

    public PagamentoDinheiro(Integer total, String type, Integer valorRecebido) {
        super(total, type);
        this.valorRecebido = valorRecebido;
    }

    @Override
    public boolean autorizaPagamento() {
        return valorRecebido >= getTotal();
    }

    @Override
    public boolean efetuaPagamento() {
        this.troco = valorRecebido - getTotal();
        return super.efetuaPagamento();
    }

    public Integer getValorRecebido() {
        return valorRecebido;
    }

    public Integer getTroco() {
        return troco;
    }
}
