package Classes.itens;

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
}
