package com.entra21.primeiroprojetospring.model.dto;

import lombok.Data;

@Data
public class ItemListagemDTO {
    public String tipo;
    public Long id;
    public String titulo;
    public Boolean emprestado;
}
