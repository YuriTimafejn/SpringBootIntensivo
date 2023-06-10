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
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class FilmeGeneroPK {
    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;
    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FilmeGeneroPK that)) return false;
        return Objects.equals(getFilme(), that.getFilme()) && Objects.equals(getGenero(), that.getGenero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFilme(), getGenero());
    }
}
