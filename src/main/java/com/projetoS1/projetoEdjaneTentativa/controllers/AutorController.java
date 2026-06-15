package com.projetoS1.projetoEdjaneTentativa.controllers;

import com.projetoS1.projetoEdjaneTentativa.dtos.AutorDTO;
import com.projetoS1.projetoEdjaneTentativa.services.AutorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping
    public ResponseEntity<AutorDTO> cadastrar(@Valid @RequestBody AutorDTO dto) {
        return ResponseEntity.ok(autorService.cadastrar(dto));
    }

    @GetMapping
    public ResponseEntity<List<AutorDTO>> listar() {
        return ResponseEntity.ok(autorService.listarTodos());
    }
}