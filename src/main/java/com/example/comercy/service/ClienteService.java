package com.example.comercy.service;

import com.example.comercy.model.pessoas.Cliente;
import com.example.comercy.model.repositorio.ClienteRepository;

//Singleton
public final class ClienteService {

    private static final ClienteService INSTANCE = new ClienteService();
    private static final ClienteRepository REPOSITORY = new ClienteRepository();

    public static ClienteService getInstance(){
        return INSTANCE;
    }

    public static void adicionarCliente(Cliente cliente){
        REPOSITORY.addCliente(cliente);
    }

}
