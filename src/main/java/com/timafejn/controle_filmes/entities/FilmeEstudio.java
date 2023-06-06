package com.timafejn.controle_filmes.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "filme_estudio")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class FilmeEstudio {
    @EmbeddedId
    private FilmeEstudioPK id = new FilmeEstudioPK();

    public FilmeEstudio(Filme filme, Estudio estudio) {
        this.id.setFilme(filme);
        this.id.setEstudio(estudio);
    }
}
