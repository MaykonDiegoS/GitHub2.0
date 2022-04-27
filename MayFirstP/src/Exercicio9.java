import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        System.out.println("Qual a temperatura em ºF");
        Scanner sc = new Scanner(System.in);
        double fah = sc.nextDouble();

        System.out.printf("A temperatura em ºC é: = %.2f", (((fah - 32) / 9)*5));
    }
}