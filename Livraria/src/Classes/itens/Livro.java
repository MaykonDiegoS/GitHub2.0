package Classes.itens;

import java.util.Scanner;

public class Livro extends Item{

    private String autor;
    private int qtdePaginas, anoPublicacao, edicao;

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdePaginas() {
        return this.qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }

    public int getAnoPublicacao() {
        return this.anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void montarDetalhes(Scanner in) {
        System.out.print("Insira nome do autor: ");
        this.setAutor(in.nextLine());
        System.out.print("Insira quantidade de páginas: ");
        this.setQtdePaginas(in.nextInt());
        System.out.print("Insira o ano de publicação: ");
        this.setAnoPublicacao(in.nextInt());
        System.out.print("Insira a edição: ");
        this.setEdicao(in.nextInt());
        in.nextLine();
    }

    @Override
    public void mostrarDetalhes() {

    }
}
