package Classes.itens;

import java.util.Scanner;

public class DVD extends Item{

    private String diretor;

    private double duracao;

    private int anoLancamento;

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getDuracao() {
        return this.duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public void montarDetalhes(Scanner in) {
        System.out.print("Insira o nome do diretor: ");
        this.setDiretor(in.nextLine());
        System.out.print("Insira o tempo de duração: ");
        this.setDuracao(in.nextDouble());
        System.out.print("Insira o ano de lançamento: ");
        this.setAnoLancamento(in.nextInt());
        in.nextLine();
    }

    @Override
    public void mostrarDetalhes() {

    }
}
