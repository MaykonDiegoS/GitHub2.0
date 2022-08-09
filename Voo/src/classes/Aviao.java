package classes;

import java.util.ArrayList;

public class Aviao implements MeioTransporte{

    private static final String setRed = "\u001B[31m";
    private static final String setGreen = "\u001B[32m";
    private static final String setWhite = "\u001B[0m";

    //Atributo
    private ArrayList<AssentoVoo> assentos = new ArrayList<>();

    //Constructor
    public Aviao(int linhasCadeirasLuxo, int linhasCadeirasEconomicas) {
        int letraCodigo =65;
        int num = 1;
        for(int i = 1; i <= (linhasCadeirasLuxo * 4); i++) {
            AssentoVoo assentoVoo = new AssentoVoo();
            assentoVoo.setClasse(ClasseAssentoVoo.lUXO);
            char letra = (char) letraCodigo;
            if(num<10) {
                assentoVoo.setCodigo(letra + "0" + num);
            }else{
                assentoVoo.setCodigo(letra + "" + num);
            }
            this.getAssentos().add(assentoVoo);
            letraCodigo++;
            if(i % 4 == 0) {
                letraCodigo = 65;
                num++;
            }
        }
        letraCodigo = 65;
        num = 1;
        for(int i = 1; i <=(linhasCadeirasEconomicas * 6); i++) {
            AssentoVoo assentoVoo = new AssentoVoo();
            assentoVoo.setClasse(ClasseAssentoVoo.ECONOMICA);
            char letra = (char) letraCodigo;
            if(num<10) {
                assentoVoo.setCodigo(letra + "0" + num);
            }else{
                assentoVoo.setCodigo(letra + "" + num);
            }
            this.getAssentos().add(assentoVoo);
            letraCodigo++;
            if(i % 6 == 0) {
                letraCodigo = 65;
                num++;
            }
        }
    }

    //Métodos

    @Override
    public boolean verificaOcupacao(String verifica) {
        for(AssentoVoo a : this.assentos) {
            if(a.getCodigo().equalsIgnoreCase(verifica)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int livres = 0;
        for(AssentoVoo a : this.assentos) {
            if(!a.isOcupado()) {
                livres++;
            }
        }
        return livres;
    }

    @Override
    public void mostrarAssentos() {
        System.out.println("\t\t\t\t-- EXECUTIVA --");
        System.out.print("\t\t");
        for(int i = 0; i < this.getAssentos().size();i++) {
            if(getAssentos().get(i).getClasse().equals(ClasseAssentoVoo.ECONOMICA)) {
                break;
            }

            if(this.getAssentos().get(i).isOcupado()) {
                System.out.print(setRed);
                System.out.print("[XXX]\t");
            }else {
                System.out.print(setGreen);
                System.out.print("[" + this.getAssentos().get(i).getCodigo() + "]\t");
            }
            System.out.print(setWhite);
            if((i+1) % 4 == 0) {
                System.out.print("\n\t\t");
            } else if ((i+1) % 2 == 0) {
                System.out.print("||\t");
            }
        }

        System.out.println("\n\t\t\t\t-- ECONÔMICA --");
        for(int i = 0; i < this.getAssentos().size();i++) {
            if(getAssentos().get(i).getClasse().equals(ClasseAssentoVoo.lUXO)) {
                continue;
            }

            if(this.getAssentos().get(i).isOcupado()) {
                System.out.print(setRed);
                System.out.print("[XXX]\t");
            }else {
                System.out.print(setGreen);
                System.out.print("[" + this.getAssentos().get(i).getCodigo() + "]\t");
            }
            System.out.print(setWhite);
            if((i-1) % 6 == 0) {
                System.out.println();
            } else if ((i-1) % 3 == 0) {
                System.out.print("||\t");
            }
        }
    }

    @Override
    public Assento getAssento(String assento) {
        for(AssentoVoo assentoVoo : this.assentos) {
            if (assentoVoo.getCodigo().equalsIgnoreCase(assento)) {
                return assentoVoo;
            }
        }
        return null;
    }

    public Assento getAssento(String assento, ClasseAssentoVoo classe) {
        for(AssentoVoo assentoVoo : this.assentos) {
            if(assentoVoo.getCodigo().equalsIgnoreCase(assento) && assentoVoo.getClasse().equals(classe)) {
                return assentoVoo;
            }
        }
        return null;
    }

    //Getters e Setters

    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }
}
