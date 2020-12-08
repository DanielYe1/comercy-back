package com.example.comercy.model.pagamentos;

public class PagamentoDebito extends Pagamento {
    private String numeroCartao;

    public PagamentoDebito(Integer total, String type, String numeroCartao) {
        super(total, type);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public boolean autorizaPagamento() {
        return super.autorizaPagamento();
    }

    @Override
    public boolean efetuaPagamento() {
        return super.efetuaPagamento();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }
}
