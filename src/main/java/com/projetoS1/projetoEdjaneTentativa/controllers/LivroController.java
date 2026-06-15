package com.projetoS1.projetoEdjaneTentativa.controllers;

import com.projetoS1.projetoEdjaneTentativa.dtos.LivroDTO;
import com.projetoS1.projetoEdjaneTentativa.services.LivroService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public ResponseEntity<LivroDTO> cadastrar(@Valid @RequestBody LivroDTO dto) {
        return ResponseEntity.ok(livroService.cadastrar(dto));
    }

    @GetMapping
    public ResponseEntity<List<LivroDTO>> listar() {
        return ResponseEntity.ok(livroService.listarTodos());
    }

    @PutMapping("/{id}")
    public ResponseEntity<LivroDTO> atualizar(@PathVariable Long id, @Valid @RequestBody LivroDTO dto) {
        return ResponseEntity.ok(livroService.atualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        livroService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}