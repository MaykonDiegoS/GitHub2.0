package Exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Horário de ínicio");
        int inicio = sc.nextInt();
        System.out.println("Horarío de término");
        int fim = sc.nextInt();

        if (inicio >= fim) {
            System.out.println("No total foram: " + (24 - inicio + fim) + " horas");
        }
        else {
            System.out.println("No total foram: " + (fim - inicio) + " horas");
        }
    }
}
