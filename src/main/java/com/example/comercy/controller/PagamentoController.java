package com.example.comercy.controller;

import com.example.comercy.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin
public class PagamentoController {

    @Autowired
    PagamentoService service;

}
