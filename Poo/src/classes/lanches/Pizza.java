package classes.lanches;

public class Pizza extends MiniPizza{

    private String tamanho;
    public Pizza() {
        this.setTipo("Pizza");
    }

    public void montarComanda() {
        super.montarComanda();
        System.out.println("-- TAMANHO: " + this.getTamanho().toUpperCase() + " --");
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return this.tamanho;
    }
}