package com.example.comercy.model.pagamentos;

public class PagamentoDinheiro extends Pagamento {
    private Integer valorRecebido;

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
        return super.efetuaPagamento();
    }
}
