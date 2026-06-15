package com.projetoS1.projetoEdjaneTentativa.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LivroDTO {

    private Long id;

    @NotBlank(message = "O título do livro não pode estar em branco")
    private String titulo;

    @NotNull(message = "O ano de publicação é obrigatório")
    private Integer anoPublicacao;

    @NotNull(message = "O ID do autor é obrigatório")
    private Long autorId;

    public LivroDTO() {}

    public LivroDTO(Long id, String titulo, Integer anoPublicacao, Long autorId) {
        this.id = id;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autorId = autorId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public Integer getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(Integer anoPublicacao) { this.anoPublicacao = anoPublicacao; }
    public Long getAutorId() { return autorId; }
    public void setAutorId(Long autorId) { this.autorId = autorId; }
}