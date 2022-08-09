package classes;

import java.util.ArrayList;

public class Onibus implements MeioTransporte{

    //Atributo
    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    //Construtor
    public Onibus(int linhasCadeiras) {
        for(int i = 1; i <= linhasCadeiras * 4; i++) {
            AssentoOnibus assentoOnibus = new AssentoOnibus();

            if(i<10) {
                assentoOnibus.setLugar("0" + i);
            }else{
                assentoOnibus.setLugar("" + i);
            }
            this.getAssentos().add(assentoOnibus);
        }
    }

    //Métodos

    @Override
    public boolean verificaOcupacao(String verifica) {
        for(AssentoOnibus v : this.assentos){
            if(v.getLugar().equalsIgnoreCase(verifica)) {
                return v.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int livres = 0;
        for(AssentoOnibus quantidade : this.assentos){
            if(!quantidade.isOcupado()) {
                livres++;
            }
        }

        return livres;
    }

    @Override
    public void mostrarAssentos() {
        for(int i = 0; i < this.assentos.size(); i++) {
            if(this.assentos.get(i).isOcupado()) {
                System.out.print(" [XX] ");
            }else{
                    System.out.print(" [" + this.assentos.get(i).getLugar() + "] ");
            }
            if((i+1)%4 ==0) {
                System.out.println();
            } else if ((i+1)%2 == 0 ) {
                System.out.print(" || ");
            }
        }
    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus a : this.getAssentos()) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }

    //Getters e Setters

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }
}
