package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.FranquiaDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.view.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    public List<GeneroDTO> getAll() {
        return generoRepository.findAll().stream().map(gn -> {
            GeneroDTO dto = new GeneroDTO();
            dto.setId(gn.getId());
            dto.setNome(gn.getNome());
            return dto;
        }).collect(Collectors.toList());
    }

    public void saveGenero(GeneroPayloadDTO input) {
        GeneroEntity entity = new GeneroEntity();
        entity.setNome(input.getNome());
        generoRepository.save(entity);
    }

    public GeneroDTO getById(Long id) {
        GeneroEntity e = generoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Gênero não encontrada!"));
        GeneroDTO dto = new GeneroDTO();
        dto.setId(e.getId());
        dto.setNome(e.getNome());
        return dto;
    }

    public void delete(Long id) {
        generoRepository.deleteById(id);
    }

    public GeneroDTO update(Long id, String novoNome) {
        GeneroEntity e = generoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Gênero não encontrada!"));
        e.setNome(novoNome);
        e = generoRepository.save(e);
        GeneroDTO dto = new GeneroDTO();
        dto.setNome(e.getNome());
        dto.setId(e.getId());
        return dto;
    }
}
