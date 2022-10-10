package com.entra21.primeiroprojetospring.model.dto;

import lombok.Data;

import java.sql.Time;
import java.time.LocalTime;

@Data
public class DvdListagemDTO {

    private String titulo;
    private String diretor;
    private LocalTime duracao;
    private Integer anoLancamento;
}
