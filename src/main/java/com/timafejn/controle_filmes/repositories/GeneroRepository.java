package com.timafejn.controle_filmes.repositories;

import com.timafejn.controle_filmes.entities.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
}
