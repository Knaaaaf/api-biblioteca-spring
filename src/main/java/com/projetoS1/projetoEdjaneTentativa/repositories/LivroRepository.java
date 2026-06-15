package com.projetoS1.projetoEdjaneTentativa.repositories;

import com.projetoS1.projetoEdjaneTentativa.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}