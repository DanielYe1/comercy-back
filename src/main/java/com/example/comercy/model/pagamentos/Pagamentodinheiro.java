package com.example.comercy.model.pagamentos;

public class Pagamentodinheiro extends Pagamento {
    private Integer troco;

    public Pagamentodinheiro(Integer total, String type, Integer troco) {
        super(total, type);
        this.troco = troco;
    }
}
