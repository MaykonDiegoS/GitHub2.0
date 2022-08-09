import java.lang.reflect.Array;
import java.util.ArrayList;

public class Baralho {
    //Atributo
    private ArrayList<Carta> cartas = new ArrayList<>() {
        //todo
    };

    Baralho() {
        int valorNaipe = 1;
        for (Naipe naipe : Naipe.values()) {
            int valor = 1;
            for (ValorCarta valorCarta : ValorCarta.values()) {
                Carta c = new Carta();
                c.setNaipe(naipe);
                c.setValor(valorCarta);
                c.setValorReal(valor);
                valor++;

            }
        }
    }

        //Métodos
        public void shuffle () {
            //todo
        }

        public Carta getFromTop () {
            //todo
            return null;
        }

        public Carta getFromBottom () {
            //todo
            return null;
        }

        public Carta searchCard (Naipe naipe, ValorCarta valor){
            //todo
            return null;
        }

        public Carta searchCard (Naipe naipe,int valorReal){
            //todo
            return null;
        }

        //Getters e Setters


        public ArrayList<Carta> getCartas () {
            return this.cartas;
        }

        public void setCartas (ArrayList < Carta > cartas) {
            this.cartas = cartas;
        }
    }
}