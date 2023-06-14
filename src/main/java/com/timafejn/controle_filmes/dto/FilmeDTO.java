package com.timafejn.controle_filmes.dto;

import com.timafejn.controle_filmes.entities.Filme;
import org.springframework.beans.BeanUtils;

public record FilmeDTO( Long id, String titulo, String tituloOriginal, Integer duracao, Integer ano, String imgUrl, String sinopse) {
    public FilmeDTO(Filme filme) {
        this(filme.getId(), filme.getTitulo(), filme.getTituloOriginal(), filme.getDuracao(), filme.getAno(), filme.getImgUrl(), filme.getSinopse());
    }
}
