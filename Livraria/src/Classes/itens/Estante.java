package Classes.itens;

import java.util.ArrayList;

public class Estante {
    //atributos
    private int capMaxima;
    private ArrayList<Item> itens = new ArrayList<>();

    //construtor cria um objeto
    //agregação tem um
    //composição é parte de um
    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
    }

    //métodos
    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens() {
        return this.itens.size();
    }

    public Item buscarItem(String titulo) {
        return this.itens.stream().filter(i -> i.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElse(null);
    }

    public boolean adicionarItem(Item item) {
        if(!estanteCheia()) {
           return this.itens.add(item);
        }
        return false;
    }

    public Item removerItem(int posicao) {
        return this.itens.remove(posicao);
    }

    //Getters & Setters
    public int getCapMaxima() {
        return this.capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public ArrayList<Item> getItens() {
        return this.itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}
