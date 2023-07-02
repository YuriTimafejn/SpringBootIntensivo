package com.timafejn.controle_filmes.controllers;

import com.timafejn.controle_filmes.dto.EstudioDTO;
import com.timafejn.controle_filmes.dto.FilmesInfoDTO;
import com.timafejn.controle_filmes.servicies.EstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/estudio")
public class EstudioController {
    @Autowired
    private EstudioService estudioService;

    @GetMapping
    public List<EstudioDTO> findAll() {
        return this.estudioService.findAll();
    }

    @GetMapping(value = "/{estudio}")
    public List<FilmesInfoDTO> findByEstudio(@PathVariable String estudio) {
        return this.estudioService.findByEstudio(estudio);
    }
}
