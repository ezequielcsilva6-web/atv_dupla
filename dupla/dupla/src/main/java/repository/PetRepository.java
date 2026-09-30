package repository;

import entity.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Long> {
    Optional<PetEntity> findById(Long id);

    // Procura todos os pets associados a um clienteId
    List<PetEntity> findByClienteId(Long clienteId);
}