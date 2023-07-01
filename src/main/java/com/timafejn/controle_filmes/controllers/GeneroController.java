package com.timafejn.controle_filmes.controllers;

import com.timafejn.controle_filmes.dto.FilmeDTO;
import com.timafejn.controle_filmes.dto.FilmesInfoDTO;
import com.timafejn.controle_filmes.dto.GeneroDTO;
import com.timafejn.controle_filmes.servicies.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/genero")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    @GetMapping
    public List<GeneroDTO> findAll() {
        return this.generoService.findAlL();
    }

    @GetMapping(value = "/{name}")
    public List<FilmesInfoDTO> findByGenero( @PathVariable String name) {
        return generoService.findByGenero(name);
    }
}
