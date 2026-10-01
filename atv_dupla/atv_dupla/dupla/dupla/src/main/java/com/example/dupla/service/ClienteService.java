package com.example.dupla.service;

import com.example.dupla.entity.ClienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dupla.repository.ClienteRepository;

import java.util.List;
import java.util.Optional; // Adicionado para lidar com buscas por ID

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Método para salvar um novo cliente ou atualizar um existente
    public ClienteEntity salvar(ClienteEntity cliente) {
        ClienteEntity save = clienteRepository.save(cliente);
        return save;
    }

    // Método para listar todos os clientes cadastrados
    public List<ClienteEntity> listarTodos() {
        return clienteRepository.findAll();
    }

    // Método para buscar um cliente específico pelo ID
    public Optional<ClienteEntity> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    // Método para deletar um cliente pelo ID
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}