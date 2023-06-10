package com.timafejn.controle_filmes.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "filme_genero")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class FilmeGenero {
    @EmbeddedId
    private FilmeGeneroPK id = new FilmeGeneroPK();

    public FilmeGenero (Filme filme, Genero genero) {
        this.id.setFilme(filme);
        this.id.setGenero(genero);
    }
}
