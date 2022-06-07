package classes.pedido;

import classes.lanches.*;

public class Pedido {

    private Lanche[] lanches = new Lanche[10];

    public void imprimirComanda() {

        for (Lanche lanche : this.getLanches()) {
            if(lanche != null) {
                if(lanche instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza)lanche);
                    System.out.println("====" + mp.getTipo() + " - " +mp.getSabor() + "====");
                    if (mp.isBordaRecheada()) {
                        System.out.println("-- COM BORDA RECHEADA: " + mp.getSaborBorda().toUpperCase() + " --");
                    }
                    if(lanche instanceof Pizza) {
                        System.out.println("-- TAMANHO: " + ((Pizza)lanche).getTamanho().toUpperCase() + " --");
                    }
                }else {
                    System.out.println("====" + lanche.getTipo() + "====");
                }
                if(lanche instanceof XBurguer) {
                    if(((XBurguer)lanche).isAberto()) {
                        System.out.println("-- LANCHE ABERTO --");
                    }
                }
                System.out.printf("Valor: R$%.2f\n", lanche.getValor());
                System.out.println("-INGREDIENTES-");
                for (String ingrediente : lanche.getIngredientes()) {
                    if(ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }
            }
            if(lanche instanceof Sanduíche) {
                Sanduíche sanduiche= (Sanduíche) lanche;
            if (sanduiche.getAdicionais()[0] != null) {
                System.out.println("-ADICIONAIS-");
                for (String adicional : sanduiche.getAdicionais()) {
                    if (adicional != null) {
                        System.out.println(adicional);
                        }
                    }
                }
            }
        }
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("--------------------------------------");
    }

    public double calcularValorTotal() {
        double total = 0;
        for(Lanche lanche: this.getLanches()) {
            if(lanche != null) {
                total = total + lanche.getValor();
            }
        }
        return total;
    }

    public void adicionarLanche(Lanche lanche) {
        for(int i = 0; i < 10; i++) {
            if(this.lanches[i] == null) {
                this.lanches[i] = lanche;
                break;
            }
        }
    }

    public Lanche[] getLanches() {
        return this.lanches;
    }
}
