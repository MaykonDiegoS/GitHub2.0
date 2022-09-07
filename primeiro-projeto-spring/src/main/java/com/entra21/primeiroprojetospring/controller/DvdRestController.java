package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.DvdListagemDTO;
import com.entra21.primeiroprojetospring.model.entity.DvdEntity;
import com.entra21.primeiroprojetospring.view.repository.DvdRepository;
import com.entra21.primeiroprojetospring.view.service.DvdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dvds")
public class DvdRestController {

    @Autowired
    private DvdService dvdService;

    @GetMapping
    public List<DvdListagemDTO> getDvds() {
        return dvdService.getAll();
    }
}
