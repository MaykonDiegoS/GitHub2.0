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

    @Override
    public void montarComanda() {
        super.montarComanda();
        if(this.isAberto()) {
            System.out.println("-- LANCHE ABERTO --");
        }
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public boolean isAberto() {
        return this.aberto;
    }
}
