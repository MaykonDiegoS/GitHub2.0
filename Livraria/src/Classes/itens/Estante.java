package Classes.itens;

public class Estante {
    //atributos
    private int capMaxima;
    private Item[] itens;

    //construtor cria um objeto
    //agregação tem um
    //composição é parte de um
    public Estante(int capMaxima) {
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);
    }

    //métodos
    public boolean estanteCheia() {
        return getCapMaxima() == quantidadeItens();
    }

    public int quantidadeItens() {
        int qtdItens = 0;
        for(Item item : itens) {
            if(item != null) {
                qtdItens++;
            }
        }
        return qtdItens;
    }

    public Item buscarItem(String titulo) {
        for(Item item : itens) {
            if(item.getTitulo().equalsIgnoreCase(titulo)) {
            return item;
            }
        }
        return null;
    }

    public boolean adicionarItem(Item item) {
        for(int i = 0; i < itens.length; i++) {
            if(itens[i] == null) {
                return true;
            }
        }
        return false;
    }

    public Item removerItem(int posicao) {
        Item item = itens[posicao];
        itens[posicao] = null;
        return item;
    }

    //Getters & Setters
    public int getCapMaxima() {
        return this.capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public Item[] getItens() {
        return this.itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}
