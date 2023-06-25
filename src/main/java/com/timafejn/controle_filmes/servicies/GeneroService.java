package com.timafejn.controle_filmes.servicies;

import com.timafejn.controle_filmes.dto.GeneroDTO;
import com.timafejn.controle_filmes.entities.Genero;
import com.timafejn.controle_filmes.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    @Transactional(readOnly = true)
    public List<GeneroDTO> findAlL(){
        List<Genero> generos = generoRepository.findAll();
        return generos.stream().map(GeneroDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GeneroDTO findByGenero (String genero) {
        return new GeneroDTO(generoRepository.findByGenero(genero));
    }
}
