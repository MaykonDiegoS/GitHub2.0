package classes;

public class MiniPizza extends Lanche{
    public boolean bordaRecheada;
    public String saborBorda;
    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Calabresa");
        this.adicionarIngrediente("Mozzarella");
        this.adicionarIngrediente("Molho de tomate");
        this.tipo = "MiniPizza";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.bordaRecheada) {
            System.out.println("-- COM BORDA RECHEADA: " + this.saborBorda.toUpperCase() + " --");
        }
    }
}