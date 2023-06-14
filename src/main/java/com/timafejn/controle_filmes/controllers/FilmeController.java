package com.timafejn.controle_filmes.controllers;

import com.timafejn.controle_filmes.dto.FilmeDTO;
import com.timafejn.controle_filmes.dto.FilmesInfoDTO;
import com.timafejn.controle_filmes.servicies.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/filme")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<FilmesInfoDTO> findAll() {
        return filmeService.findAll();
    }

    @GetMapping(value = "/{id}")
    public FilmeDTO findById (@PathVariable Long id) {
        return filmeService.findById(id);
    }
}
