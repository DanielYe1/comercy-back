package com.example.comercy.controller;

import com.example.comercy.controller.model.PagamentoAPI;
import com.example.comercy.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin
public class PagamentoController {

    @Autowired
    PagamentoService service;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity efetuarPagamento(@RequestBody PagamentoAPI pagamento) {

        service.processarPagamento(pagamento);

        return new ResponseEntity(HttpStatus.OK);
    }

}
