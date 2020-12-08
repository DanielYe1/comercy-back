package com.example.comercy.model.pagamentos;

public class PagamentoCredito extends Pagamento {
    private String numeroCartao;

    public PagamentoCredito(Integer total, String type, String numeroCartao) {
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
