package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Escreva um número qualquer!");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        System.out.println("número escolhido: " + numero);

        numero--;

        System.out.println("O número antecessor é: " + numero);
    }
}
