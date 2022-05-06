package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        System.out.println("Escreva qualquer número: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        if (valor > 10) {
            System.out.println(valor + " É MAIOR QUE 10");
        }
        else {
            System.out.println(valor + " NÃO É MAIOR QUE 10");
        }
    }
}
