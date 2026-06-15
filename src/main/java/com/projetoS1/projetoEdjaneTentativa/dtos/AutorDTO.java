package com.projetoS1.projetoEdjaneTentativa.dtos;

import jakarta.validation.constraints.NotBlank;

public class AutorDTO {

    private Long id;

    @NotBlank(message = "O nome do autor não pode estar em branco")
    private String nome;

    public AutorDTO() {}

    public AutorDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}