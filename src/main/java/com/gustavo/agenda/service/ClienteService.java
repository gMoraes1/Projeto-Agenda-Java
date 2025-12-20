package com.gustavo.agenda.service;

import java.util.ArrayList;
import java.util.List;

import com.gustavo.agenda.dto.ClienteDTO;
import com.gustavo.agenda.model.Cliente;
import com.gustavo.agenda.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository repository){
        this.repository = repository;
    }

    public List<Cliente> listarCliente() {
        return repository.findAll();
    }

    public Cliente criarCliente(ClienteDTO dto) {
        Cliente cliente  = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setTelefone(dto.getTelefone());
        return repository.save(cliente);
    }

    public void removerCliente(Integer id) {
        repository.deleteById(id);
    }

}
