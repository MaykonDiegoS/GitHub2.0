package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.DvdListagemDTO;
import com.entra21.primeiroprojetospring.model.dto.ItemListagemDTO;
import com.entra21.primeiroprojetospring.view.repository.DvdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DvdService {

    @Autowired
    private DvdRepository dvdRepository;

    public List<DvdListagemDTO> getAll() {
        return dvdRepository.findAll().stream().map(i -> {
            DvdListagemDTO dto = new DvdListagemDTO();
            dto.setDiretor(i.getDiretor());
            dto.setAnoLancamento(i.getAnoLancamento());
            dto.setDuracao(i.getDuracao());
            return dto;
        }).collect(Collectors.toList());
    }
}
