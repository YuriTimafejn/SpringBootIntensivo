package com.timafejn.controle_filmes.repositories;

import com.timafejn.controle_filmes.entities.Estudio;
import com.timafejn.controle_filmes.projection.EstudioFilmeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstudioRepository extends JpaRepository<Estudio, Long> {
    @Query(nativeQuery = true, value = """
            SELECT e.ID "ID_ESTUDIO", f.ID "ID_FILME", f.TITULO, f.ANO, f.DURACAO, f.SINOPSE, f.URL
            FROM ESTUDIO AS E
            INNER JOIN FILME_ESTUDIO AS fe ON e.ID = fe.ESTUDIO_ID
            INNER JOIN FILME AS f ON fe.FILME_ID = f.ID
            WHERE UPPER(E.URL) = UPPER(?1)
            """)
    public List<EstudioFilmeProjection> findByEstudio(String nomeEstudio);
}
