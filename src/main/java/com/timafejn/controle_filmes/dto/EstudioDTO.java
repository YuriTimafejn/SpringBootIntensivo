package com.timafejn.controle_filmes.dto;

import com.timafejn.controle_filmes.entities.Estudio;

public record EstudioDTO(Long id, String estudio) {
    public EstudioDTO(Estudio estudio) { this(estudio.getId(), estudio.getEstudio());
    }
}
