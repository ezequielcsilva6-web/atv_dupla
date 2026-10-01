package com.example.dupla.repository;

import com.example.dupla.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository {

    void deleteById(Long id);

    Optional<ClienteEntity> findById(Long id);

    List<ClienteEntity> findAll();

    ClienteEntity save(ClienteEntity cliente);

    @Repository
    public interface clienteRepository extends JpaRepository<ClienteEntity, Long> {

        // O JpaRepository já fornece métodos como save(), findAll(), findById(), deleteById()

        // Exemplo de método de busca personalizado (opcional):
        // Optional<ClienteEntity> findByEmail(String email);
    }

}
