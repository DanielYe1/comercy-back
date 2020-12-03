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
}
