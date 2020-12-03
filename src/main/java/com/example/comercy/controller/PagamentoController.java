package com.example.comercy.controller;

import com.example.comercy.controller.dto.PagamentoDTO;
import com.example.comercy.model.pagamentos.Pagamento;
import com.example.comercy.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/pagamento")
public class PagamentoController {

    @Autowired
    PagamentoService service;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public ResponseEntity efetuarPagamento(@RequestBody PagamentoDTO pagamento) {

        Pagamento pagamentoProcessado = service.processarPagamento(pagamento);

        ResponseEntity responseEntity = new ResponseEntity(pagamentoProcessado, HttpStatus.OK);
        return responseEntity;
    }
}
