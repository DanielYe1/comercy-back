package com.example.comercy.service;

import com.example.comercy.model.pessoas.Cliente;
import com.example.comercy.model.repositorio.ClienteRepository;

//Singleton
public final class ClienteServiceSingleton {

    private static final ClienteServiceSingleton INSTANCE = new ClienteServiceSingleton();
    private static final ClienteRepository REPOSITORY = new ClienteRepository();

    public static ClienteServiceSingleton getInstance(){
        return INSTANCE;
    }

    public static void adicionarCliente(Cliente cliente){
        REPOSITORY.addCliente(cliente);
    }

}
