package Exemplos;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int soma = 0;
            for (int i = 0; i < 5; i++) {
                System.out.print("Informe um número: ");
                soma += in.nextInt();
            }
            System.out.println("A soma é: " + soma);
        }
    }

