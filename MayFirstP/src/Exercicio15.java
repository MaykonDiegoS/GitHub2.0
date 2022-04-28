import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        System.out.println("Comparação de valores:");

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite mais um valor: ");
        int valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1 + " é maior");
        }
        else {
            System.out.println(valor2 + " é maior");
        }
    }
}
