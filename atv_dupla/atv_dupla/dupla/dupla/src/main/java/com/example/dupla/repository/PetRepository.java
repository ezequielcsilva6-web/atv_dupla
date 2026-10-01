package com.example.dupla.repository;

import com.example.dupla.entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Long> {
    Optional<PetEntity> findByNome(String nome);

    // Procura todos os pets associados a um clienteId
    List<PetEntity> findByClienteId(Long clienteId);

    boolean existsByNome(Long id);
}