package com.example.dupla.controller;

import com.example.dupla.entity.PetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.dupla.service.PetService;

import java.util.List;
import java.util.Map;

@RestController       // 1. Falta esta anotação para indicar que é uma API REST
@RequestMapping("/pets") // 2. Falta esta anotação para definir a rota base /pets
public class PetController {

    @Autowired
    private PetService service;

    public PetController(PetService service) {
        this.service = service;
    }

    // GET /pets
    @GetMapping
    public List<PetEntity> listarTodos() {
        List<PetEntity> petEntitys = service.listarTodosPets();
        return petEntitys;
    }

    // GET /pets/cliente/{clienteId}
    @GetMapping("/cliente/{clienteId}")
    public List<PetEntity> listarPorCliente(@PathVariable Long clienteId) {
        return service.listarPetsPorCliente(clienteId);
    }

    // POST /pets
    @PostMapping
    public ResponseEntity<Map<String, String>> salvar(@RequestBody PetEntity pet) {
        service.salvarPet(pet);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "pet cadastrado com sucesso"));
    }

    // PUT /pets/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Map<String, String>> atualizar(@PathVariable Long id, @RequestBody PetEntity pet) {
        service.atualizarPet(id, pet);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "pet atualizado com sucesso"));
    }

    // DELETE /pets/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> excluir(@PathVariable Long id) {
        service.excluirPet(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("mensagem", "pet excluido com sucesso"));
    }
}