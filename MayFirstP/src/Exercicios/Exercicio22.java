package Exercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estoque atual: ");
        int estoque = sc.nextInt();
        System.out.println("Estoque máximo:");
        int maxEstoque = sc.nextInt();
        System.out.println("Estoque mínimo");
        int minEstoque = sc.nextInt();
        int media = ((maxEstoque + minEstoque) / 2);

        if (estoque >= media) {
            System.out.println("Não efetuar compra");
        }
        else {
            System.out.println("Efetuar compra");
        }
    }
}
