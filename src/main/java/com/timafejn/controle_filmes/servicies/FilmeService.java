package com.timafejn.controle_filmes.servicies;

import com.timafejn.controle_filmes.dto.FilmeInfoDTO;
import com.timafejn.controle_filmes.entities.Filme;
import com.timafejn.controle_filmes.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;
    public List<FilmeInfoDTO> findAll(){
        List<Filme> filmes = filmeRepository.findAll();
        return filmes.stream().map(x -> new FilmeInfoDTO(x)).toList();
    }
}
