import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Qual a altura do retângulo?");
        Scanner sc1 = new Scanner(System.in);
        Double altura = sc1.nextDouble();

        System.out.println("Qual o comprimento do retângulo");
        Scanner sc2 = new Scanner(System.in);
        Double largura = sc2.nextDouble();

        System.out.println("A área do retângulo é: " + (altura*largura));
        System.out.println("O perímetro do retângulo é: " + ((altura*2) + (largura*2)));
    }
}
