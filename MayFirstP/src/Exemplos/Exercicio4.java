package Exemplos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int valor = 1;
        while (valor != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Qual tabuada deseja saber?");
             valor = sc.nextInt();
            if (valor != 0) {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i * valor);
                }
            }
        }
    }
}
//pedir a tabuada e dar toda ela
