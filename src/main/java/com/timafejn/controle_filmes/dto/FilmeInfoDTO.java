package com.timafejn.controle_filmes.dto;

import com.timafejn.controle_filmes.entities.Filme;
public record FilmeInfoDTO(Long id, String titulo, Integer ano, Integer duracao, String sinopse, String url) {
    public FilmeInfoDTO(Filme filme){
        this(filme.getId(), filme.getTitulo(), filme.getAno(), filme.getDuracao(), filme.getSinopse(), filme.getImgUrl());
    }
}
