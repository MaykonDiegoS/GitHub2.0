package Classes.itens;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Item {
    private String titulo, genero;
    private double valor;
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    //método
    public void avaliar() {
        Scanner in = new Scanner(System.in);
        Avaliacao avaliacao = new Avaliacao();
        System.out.println("Avaliação");
        System.out.println("Insira seu nome: ");
        avaliacao.setNome(in.nextLine());
        System.out.println("Qual a sua avaliação (0 a 10): ");
        avaliacao.setRating(in.nextDouble());
        in.nextLine();
        System.out.print("Informe algum feedback (opcional): ");
        avaliacao.setFeedback(in.nextLine());
        this.getAvaliacoes().add(avaliacao);
    }

    public double getTotalRating() {
        return this.avaliacoes.stream().mapToDouble(Avaliacao::getRating).sum()/this.avaliacoes.size();
    }

    public abstract void montarDetalhes(Scanner in);

    public abstract void mostrarDetalhes();


    //Getter & Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
