package com.example.comercy.service;

import com.example.comercy.controller.dto.PagamentoDTO;
import com.example.comercy.model.pagamentos.NotaFiscal;
import com.example.comercy.model.pagamentos.Pagamento;
import com.example.comercy.model.repositorio.ItemRepository;
import com.example.comercy.model.vendas.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PagamentoService {

    @Autowired
    ItemRepository repository;

    public void insereProdutos(){
        Item item = new Item(100,10,"1234","","produto teste");
        repository.insert(item);
    }

    public NotaFiscal gerarNotaFiscal(Map<String, Integer> itens) {
        insereProdutos();
        Integer total = 0;
        for (Map.Entry<String, Integer> entry : itens.entrySet()) {
            total += repository.findFirstByCodigoDeBarras(entry.getKey()).getPreco() * entry.getValue();
        }

        return new NotaFiscal(itens, total);
    }

    public Pagamento processarPagamento(PagamentoDTO pagamento) {
        Pagamento pagamentoProcessado = PagamentoCreator.pagamentoFactoryMethod(pagamento);

        if (pagamentoProcessado.autorizaPagamento()) {
            pagamentoProcessado.efetuaPagamento();
            return pagamentoProcessado;
        }

        return null;
    }
}


