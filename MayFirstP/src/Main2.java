import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        exe02();
    }
    public static void exe01() {
        int A = 10;
        int B = 20;
        int C = A;
        A = B;
        B = C;
        System.out.println(A);
        System.out.println(B);
    }
    public static void exe02() {
        System.out.println("Escreva um número qualquer!");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        System.out.println("número escolhido: " + numero);
        numero--;

        System.out.println("O número antecessor é: " + numero);
    }
    public static void exe03() {
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
