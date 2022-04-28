import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite outro valor: ");
        int valor2 = sc.nextInt();

        if (valor1 < valor2) {
            System.out.println("Primeiro: " + valor1 + "; Segundo: " + valor2);
        }
        else {
            System.out.println("Primeiro: " + valor2 + "; Segundo: " + valor1);
        }
    }
}
