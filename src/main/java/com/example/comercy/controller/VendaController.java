package com.example.comercy.controller;

import com.example.comercy.controller.dto.VendaDTO;
import com.example.comercy.model.pagamentos.NotaFiscal;
import com.example.comercy.model.pagamentos.Pagamento;
import com.example.comercy.model.vendas.Venda;
import com.example.comercy.service.PagamentoService;
import com.example.comercy.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/pagamento")
public class VendaController {

    @Autowired
    PagamentoService pagamentoService;

    @Autowired
    VendaService vendaService;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public ResponseEntity efetuarPagamento(@RequestBody VendaDTO venda) {
        NotaFiscal notaFiscal = pagamentoService.gerarNotaFiscal(venda.getItens());

        Pagamento pagamento = pagamentoService.processarPagamento(venda.getPagamento());

        Venda vendaProcessada = vendaService.processarVenda(venda.getIdCliente(), venda.getItens(), pagamento, notaFiscal);

        ResponseEntity responseEntity = new ResponseEntity(vendaProcessada, HttpStatus.OK);
        return responseEntity;
    }
}
