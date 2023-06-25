package com.timafejn.controle_filmes.repositories;

import com.timafejn.controle_filmes.entities.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudioRepository extends JpaRepository<Estudio, Long> {
    Estudio findByEstudio(String nomeEstudio);
}
