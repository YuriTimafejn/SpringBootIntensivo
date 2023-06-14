package com.timafejn.controle_filmes.servicies;

import com.timafejn.controle_filmes.dto.FilmeDTO;
import com.timafejn.controle_filmes.dto.FilmesInfoDTO;
import com.timafejn.controle_filmes.entities.Filme;
import com.timafejn.controle_filmes.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;
    @Transactional(readOnly = true)
    public List<FilmesInfoDTO> findAll(){
        List<Filme> filmes = filmeRepository.findAll();
        return filmes.stream().map(x -> new FilmesInfoDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public FilmeDTO findById(Long id) {
        Filme filme = filmeRepository.findById(id).get();
        return new FilmeDTO(filme);
    }
}
