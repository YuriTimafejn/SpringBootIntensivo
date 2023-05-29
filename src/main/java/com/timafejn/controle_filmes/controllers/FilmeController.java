package com.timafejn.controle_filmes.controllers;

import com.timafejn.controle_filmes.dto.FilmeInfoDTO;
import com.timafejn.controle_filmes.entities.Filme;
import com.timafejn.controle_filmes.servicies.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/filme")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<FilmeInfoDTO> findAll() {
        return filmeService.findAll();
    }

}
