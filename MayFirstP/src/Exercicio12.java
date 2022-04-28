import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        System.out.println("Negativo ou positivo?");
        System.out.println("Digite um valor: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        if (valor < 0) {
            System.out.println("O " + valor + " é negativo");
        }
        else {
            System.out.println("O " + valor + " é positivo");
        }
    }
}
