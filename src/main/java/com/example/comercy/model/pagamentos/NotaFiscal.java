package com.example.comercy.model.pagamentos;

import java.util.Map;
import java.util.Random;

public class NotaFiscal {
    private String codigo;
    private Map<String, Integer> itens;
    private Integer valorTotal;
    private Integer tributos;

    public NotaFiscal(Map<String, Integer> itens, Integer valorTotal) {
        this.itens = itens;
        this.valorTotal = valorTotal;
        gerarCodigoFiscal();
        gerarTributos();
    }

    public void gerarCodigoFiscal(){
        Random random = new Random();
        this.codigo = Integer.toString(random.nextInt());
    }

    public void gerarTributos(){
        this.tributos = this.valorTotal/10;
    }


}
