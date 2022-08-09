import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carta> baralho = new ArrayList<>();

        for(Carta c : baralho) {
            System.out.println(c.getNaipe().getNaipe()+" "+c.getValor().getValor()+" "+ c.getNaipe().getNaipe());
        }
    }
}
