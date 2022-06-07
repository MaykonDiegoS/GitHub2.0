package classes.lanches;

public abstract class Sanduíche extends Lanche {
    private String[] adicionais = new String[10];

    public void adicionarAdicional(String adicional) {
        for (int i = 0; i < 10; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;
            }
        }
    }

    public String[] getAdicionais() {
        return this.adicionais;
    }

    public void setAdicionais(String[] adicionais) {
        this.adicionais = adicionais;
    }
}
