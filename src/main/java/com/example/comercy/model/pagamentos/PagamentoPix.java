package com.example.comercy.model.pagamentos;

public class PagamentoPix extends Pagamento {
    private String chave;

    public PagamentoPix(Integer total, String type, String chave) {
        super(total, type);
        this.chave = chave;
    }
}
