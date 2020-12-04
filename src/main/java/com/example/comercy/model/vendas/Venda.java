package com.example.comercy.model.vendas;

import com.example.comercy.model.pagamentos.NotaFiscal;
import com.example.comercy.model.pagamentos.Pagamento;

import java.util.List;
import java.util.Map;

public class Venda {
    private String idCliente;
    private Map<String,Integer> itens;
    private Pagamento pagamento;
    private NotaFiscal notaFiscal;

    public Venda(String idCliente, Map<String, Integer> itens, Pagamento pagamento, NotaFiscal notaFiscal) {
        this.idCliente = idCliente;
        this.itens = itens;
        this.pagamento = pagamento;
        this.notaFiscal = notaFiscal;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public Map<String, Integer> getItens() {
        return itens;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
}
