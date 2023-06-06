package com.timafejn.controle_filmes.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@Setter
@Getter
@Embeddable
public class FilmeEstudioPK {
    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "estudio_id")
    private Estudio estudio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FilmeEstudioPK that)) return false;
        return Objects.equals(getFilme(), that.getFilme()) && Objects.equals(getEstudio(), that.getEstudio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFilme(), getEstudio());
    }
}
