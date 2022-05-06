package Exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        System.out.println("Quantas maçãs foram compradas?");
        Scanner sc = new Scanner(System.in);
        double macasCompradas = sc.nextDouble();

        if (macasCompradas < 6) {
            System.out.printf("As maçãs custaram R$%.2f", (macasCompradas * 1.30));
        }
        else {
            System.out.printf("As maçãs custaram R$%.2f", (macasCompradas * 1));
        }
    }
}
