package Exemplos;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /* 1 = Pedir ao user quantas palavras ele deseja informar;
            2 = Pedir ao user cada palavra;
             3 = Informar numa única linha as palavras que o usuário informou separadas por vírgula;
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas palavras você deseja informar?");
        int num = sc.nextInt();
        String[] palavras = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Insira uma palavra: ");
            palavras[i] = sc.next();
        }
        for (String palavra : palavras) {
            if (palavra.equals(palavras[num - 1])) {
                System.out.println(palavra + ".");
            }
            else {
                System.out.print(palavra + ", ");
            }
        }

    }
}
