package com.timafejn.controle_filmes.repositories;

import com.timafejn.controle_filmes.entities.Genero;
import com.timafejn.controle_filmes.projection.GeneroFilmeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GeneroRepository extends JpaRepository<Genero, Long> {
    @Query(nativeQuery = true, value = """
            SELECT g.ID AS "ID_GENERO", g.GENERO, f.ID "ID_FILME", f.TITULO, f.ANO, f.DURACAO, f.SINOPSE, f.URL
            FROM GENERO AS g
            INNER JOIN FILME_GENERO AS fg ON g.ID = fg.GENERO_ID
            INNER JOIN FILME AS f ON fg.FILME_ID = f.ID
            WHERE UPPER(g.URL) = UPPER(?1)
            """)
    public List<GeneroFilmeProjection> findByGenero (String genero);
}
