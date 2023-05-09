package com.timafejn.controle_filmes.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "filme")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String tituloOriginal;
    private Integer ano;
    private String genero;
    @Column(name = "url")
    private String imgUrl;
    private String sinopse;

    public Filme() { }

    public Filme(String titulo, String tituloOriginal, Integer ano, String genero, String imgUrl, String sinopse) {
        this.titulo = titulo;
        this.tituloOriginal = tituloOriginal;
        this.ano = ano;
        this.genero = genero;
        this.imgUrl = imgUrl;
        this.sinopse = sinopse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Filme filmes)) return false;
        return Objects.equals(getId(), filmes.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
