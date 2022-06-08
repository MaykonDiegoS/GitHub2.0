package Classes.itens;

import javax.accessibility.AccessibleValue;
import java.util.Scanner;

public abstract class Item {
    private String titulo, genero;
    private double valor;

    private Avaliacao[] avaliacoes = new Avaliacao[30];

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

        for(int i = 0; i < this.avaliacoes.length; i++) {
            if(avaliacoes[i] == null) {
                avaliacoes[i] = avaliacao;

            }
        }

    }

    public double getTotalRating() {
        double soma = 0;
        double contador = 0;
        for(Avaliacao avaliacao: getAvaliacoes()){
            if(avaliacao != null) {
                soma += avaliacao.getRating();
                contador++;
            }
        }
        return soma/contador;
    }

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

    public Avaliacao[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
