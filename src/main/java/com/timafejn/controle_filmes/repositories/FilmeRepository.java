package com.timafejn.controle_filmes.repositories;

import com.timafejn.controle_filmes.entities.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
