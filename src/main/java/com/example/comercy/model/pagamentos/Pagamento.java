package com.example.comercy.model.pagamentos;

public class Pagamento {
    private Integer total;
    private String type;

    public Pagamento(Integer total, String type) {
        this.total = total;
        this.type = type;
    }

    public boolean autorizaPagamento(){
        return true;
    }

    public boolean efetuaPagamento(){
        return true;
    }

    public Pagamento() {
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
