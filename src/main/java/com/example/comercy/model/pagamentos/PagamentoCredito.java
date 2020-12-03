package com.example.comercy.model.pagamentos;

public class PagamentoCredito extends Pagamento {
    private String numeroCartao;

    public PagamentoCredito(Integer total, String type, String numeroCartao) {
        super(total, type);
        this.numeroCartao = numeroCartao;
    }
}
