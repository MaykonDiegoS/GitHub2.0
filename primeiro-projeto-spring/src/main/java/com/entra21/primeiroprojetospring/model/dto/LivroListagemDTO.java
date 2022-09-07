package com.entra21.primeiroprojetospring.model.dto;

import lombok.Data;

@Data
public class LivroListagemDTO {
    public String autor;
    public Integer anoPublicacao;
    public Integer edicao;
}
