package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.ItemListagemDTO;
import com.entra21.primeiroprojetospring.model.dto.LivroListagemDTO;
import com.entra21.primeiroprojetospring.view.repository.LivroRepository;
import com.entra21.primeiroprojetospring.view.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroRestController {

    @Autowired
    private LivroService LivroService;

    @GetMapping
    public List<LivroListagemDTO> getLivros(){
        return LivroService.getAll();
    }

}
