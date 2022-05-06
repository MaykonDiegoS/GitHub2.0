package Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5))/10;

        if (media < 6.0) {
            System.out.printf("Sua média foi = %.2f", media);
            System.out.println(" Você infelizmente reprovou");
        }
        else {
            System.out.printf("Sua média foi = %.2f", media);
            System.out.println(" Você felizmente passou");
        }

    }
}
