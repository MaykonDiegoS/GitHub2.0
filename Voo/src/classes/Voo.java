package classes;


public class Voo {

    public String[][] codificacaoAssento;
    public boolean[][] ocupacaoAssento;

    public Voo(int linhas, int cadeirasPorLinha) {
        this.codificacaoAssento = new String[linhas][cadeirasPorLinha];
        this.ocupacaoAssento = new boolean[linhas][cadeirasPorLinha];
        for (int i = 0; i < linhas; i++) {
            char letra = (char) (65 + i);
            for (int j = 0; j < cadeirasPorLinha; j++) {
                this.codificacaoAssento[i][j] = "" + letra + (j + 1);
            }
        }
    }

    public boolean verificaOcupacao(String codigo) {
        for (int i = 0; i < this.codificacaoAssento.length; i++) {
            for (int j = 0; j < this.codificacaoAssento[i].length; j++) {
                if (this.codificacaoAssento[i][j].equalsIgnoreCase(codigo)) {
                    return this.ocupacaoAssento[i][j];
                }
            }
        }
        return false;
    }

    public void ocupar(String codigo) {
        for (int i = 0; i < this.codificacaoAssento.length; i++) {
            for (int j = 0; j < this.codificacaoAssento[i].length; j++) {
                if (this.codificacaoAssento[i][j].equalsIgnoreCase(codigo)) {
                    this.ocupacaoAssento[i][j] = true;
                }
            }
        }
    }


    public int quantidadeLivre() {
        int qtdeAssentosLivre = 0;
        for (int i = 0; i < this.codificacaoAssento.length; i++) {
            for (int j = 0; j < this.codificacaoAssento[i].length; j++) {
                if (!this.ocupacaoAssento[i][j]) {
                    qtdeAssentosLivre++;
                }
            }
        }
        return qtdeAssentosLivre;
    }


    public void mostrarAssentos() {
        for (int i = 0; i < this.codificacaoAssento.length; i++) {
            for (int j = 0; j < this.codificacaoAssento[i].length; j++) {
                System.out.print(this.codificacaoAssento[i][j] + ":");
                if (!this.ocupacaoAssento[i][j]) {
                    System.out.print("Desocupado" + "\t");
                } else {
                    System.out.print("Ocupado   " + "\t");
                }
            }
            System.out.println();
        }
    }
}