package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.ItemListagemDTO;
import com.entra21.primeiroprojetospring.model.dto.LivroListagemDTO;
import com.entra21.primeiroprojetospring.view.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<LivroListagemDTO> getAll() {
        return livroRepository.findAll().stream().map(i -> {
            LivroListagemDTO dto = new LivroListagemDTO();
            dto.setTitulo(i.getTitulo());
            dto.setAutor(i.getAutor());
            dto.setEdicao(i.getEdicao());
            dto.setAnoPublicacao(i.getAnoPublicacao());
            return dto;
        }).collect(Collectors.toList());
    }
}
