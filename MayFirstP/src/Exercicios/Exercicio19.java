package Exercicios;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = sc.nextLine();
        System.out.println("Qual é sua altura?");
        double altura = sc.nextDouble();
        System.out.println("Qual o seu sexo? M ou F");
        sc.nextLine();
        String sexo = sc.nextLine();

        if (sexo.equals("M")) {
            System.out.printf("Olá %s, de acordo com sua altura, seu peso ideal é: %.2fkg", nome, ((72.7 * altura) - 58));
        }
        else {
            System.out.printf("Olá %s, de acordo com sua altura, seu peso ideal é: %.2fkg", nome, ((62.1 * altura) - 44.7));
        }
    }
}
