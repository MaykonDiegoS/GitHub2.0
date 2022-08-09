package Classes.itens;

import java.time.LocalDateTime;

public class Avaliacao {

    private double rating;
    private String nome, feedback;
    private final LocalDateTime dataAvaliacao = LocalDateTime.now();

    public LocalDateTime getDataAvaliacao() {
        return dataAvaliacao;
    }
    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
