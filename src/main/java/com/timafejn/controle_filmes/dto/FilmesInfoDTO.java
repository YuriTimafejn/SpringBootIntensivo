package com.timafejn.controle_filmes.dto;

import com.timafejn.controle_filmes.entities.Filme;
import com.timafejn.controle_filmes.projection.EstudioFilmeProjection;
import com.timafejn.controle_filmes.projection.GeneroFilmeProjection;

public record FilmesInfoDTO(Long id, String titulo, Integer ano, Integer duracao, String sinopse, String url) {
    public FilmesInfoDTO(Filme filme){
        this(filme.getId(), filme.getTitulo(), filme.getAno(), filme.getDuracao(), filme.getSinopse(), filme.getImgUrl());
    }

    public FilmesInfoDTO(GeneroFilmeProjection projection){
        this(projection.getIdFilme(), projection.getTitulo(),projection.getAno(),projection.getDuracao(),projection.getSinopse(),projection.getURL());
    }
    public FilmesInfoDTO(EstudioFilmeProjection projection){
        this(projection.getIdFilme(), projection.getTitulo(),projection.getAno(),projection.getDuracao(),projection.getSinopse(),projection.getURL());
    }
}
