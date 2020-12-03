package com.example.comercy.model.pagamentos;

public class Pagamento {
    private Integer total;
    private String type;
    private NotaFiscal notaFiscal;

    public Pagamento(Integer total, String type) {
        this.total = total;
        this.type = type;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
}
