package com.projetoS1.projetoEdjaneTentativa.services;

import com.projetoS1.projetoEdjaneTentativa.dtos.AutorDTO;
import com.projetoS1.projetoEdjaneTentativa.entities.Autor;
import com.projetoS1.projetoEdjaneTentativa.repositories.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutorService {

    private final AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public AutorDTO cadastrar(AutorDTO dto) {
        Autor autor = new Autor(null, dto.getNome());
        autor = autorRepository.save(autor);
        return new AutorDTO(autor.getId(), autor.getNome());
    }

    public List<AutorDTO> listarTodos() {
        return autorRepository.findAll().stream()
                .map(autor -> new AutorDTO(autor.getId(), autor.getNome()))
                .collect(Collectors.toList());
    }

    public AutorDTO atualizar(Long id, AutorDTO dto) {
        Autor autor = autorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Autor não encontrado com ID: " + id));
        autor.setNome(dto.getNome());
        autor = autorRepository.save(autor);
        return new AutorDTO(autor.getId(), autor.getNome());
    }

    public void excluir(Long id) {
        autorRepository.deleteById(id);
    }
}
