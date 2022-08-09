import classes.Aviao;
import classes.Onibus;

public class Main {
    public static void main(String[] args) {
        Aviao gol = new Aviao(8,7);
        gol.getAssento("A01", "Executiva").ocupar();
        gol.mostrarAssentos();
    }

}