package com.projetoS1.projetoEdjaneTentativa.services;

import com.projetoS1.projetoEdjaneTentativa.dtos.LivroDTO;
import com.projetoS1.projetoEdjaneTentativa.entities.Autor;
import com.projetoS1.projetoEdjaneTentativa.entities.Livro;
import com.projetoS1.projetoEdjaneTentativa.repositories.AutorRepository;
import com.projetoS1.projetoEdjaneTentativa.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {

    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;

    public LivroService(LivroRepository livroRepository, AutorRepository autorRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

    public LivroDTO cadastrar(LivroDTO dto) {
        Autor autor = autorRepository.findById(dto.getAutorId())
                .orElseThrow(() -> new RuntimeException("Autor não encontrado"));

        Livro livro = new Livro(null, dto.getTitulo(), dto.getAnoPublicacao(), autor);
        livro = livroRepository.save(livro);
        return new LivroDTO(livro.getId(), livro.getTitulo(), livro.getAnoPublicacao(), autor.getId());
    }

    public List<LivroDTO> listarTodos() {
        return livroRepository.findAll().stream()
                .map(livro -> new LivroDTO(livro.getId(), livro.getTitulo(), livro.getAnoPublicacao(), livro.getAutor().getId()))
                .collect(Collectors.toList());
    }

    public LivroDTO atualizar(Long id, LivroDTO dto) {
        Livro livro = livroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        Autor autor = autorRepository.findById(dto.getAutorId())
                .orElseThrow(() -> new RuntimeException("Autor não encontrado"));

        livro.setTitulo(dto.getTitulo());
        livro.setAnoPublicacao(dto.getAnoPublicacao());
        livro.setAutor(autor);

        livro = livroRepository.save(livro);
        return new LivroDTO(livro.getId(), livro.getTitulo(), livro.getAnoPublicacao(), autor.getId());
    }

    public void excluir(Long id) {
        if (!livroRepository.existsById(id)) {
            throw new RuntimeException("Livro não encontrado");
        }
        livroRepository.deleteById(id);
    }
}