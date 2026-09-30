package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tab_pet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String especie; // Adicionado para corresponder ao modelo[cite: 6]

    @Column(nullable = false)
    private String raca;

    @Column(name = "cliente_id", nullable = false)
    private Long clienteId; // Adição do campo clientId / clienteId[cite: 6]
}