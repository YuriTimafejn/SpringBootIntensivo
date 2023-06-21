package com.timafejn.controle_filmes.dto;

import com.timafejn.controle_filmes.entities.Genero;

public record GeneroDTO(Long id, String genero) {
    public GeneroDTO (Genero genero) {
        this(genero.getId(), genero.getGenero());
    }
}
