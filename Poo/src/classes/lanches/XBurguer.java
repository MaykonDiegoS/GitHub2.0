package classes.lanches;

public class XBurguer extends Sanduíche{

    public boolean aberto;
    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.adicionarIngrediente("Pão");
        this.setTipo("XBurguer");
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public boolean isAberto() {
        return this.aberto;
    }
}
