package com.gustavo.agenda.service;

import java.util.ArrayList;
import java.util.List;

import com.gustavo.agenda.model.Cliente;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final List<Cliente> clientes = new ArrayList<>();
    private int proximoId = 1;
    
    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente criarCliente(Cliente cliente) {
        cliente.setId(proximoId++);
        clientes.add(cliente);
        return cliente;
    }

    public void removerCliente(int id) {
        clientes.removeIf(a -> a.getId() == id);
    }


}
