package com.timafejn.controle_filmes.servicies;

import com.timafejn.controle_filmes.dto.EstudioDTO;
import com.timafejn.controle_filmes.dto.FilmesInfoDTO;
import com.timafejn.controle_filmes.entities.Estudio;
import com.timafejn.controle_filmes.projection.EstudioFilmeProjection;
import com.timafejn.controle_filmes.repositories.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstudioService {
    @Autowired
    private EstudioRepository estudioRepository;

    @Transactional(readOnly = true)
    public List<EstudioDTO> findAll() {
        List<Estudio> estudios = estudioRepository.findAll();
        return estudios.stream().map(EstudioDTO::new).toList();
    }

    public List<FilmesInfoDTO> findByEstudio(String estudio){
        List<EstudioFilmeProjection> result = estudioRepository.findByEstudio(estudio);
        return result.stream().map(FilmesInfoDTO::new).toList();
    }
}
