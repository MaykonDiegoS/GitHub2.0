package Exemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Número de colunas: ");
        int colunas = sc.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int c = 0; c < colunas; c++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
//        String[][] matriz = new String[linhas][colunas];

//        for (int i = 0; i < linhas; i++) {
//            for (int c = 0; c < colunas; c++) {
//                matriz[i][c] = "#";
//            }
//        }
//        for (int i = 0; i < linhas; i++) {
//            for (int c = 0; c < colunas; c++) {
//                System.out.print(matriz[i][c]);
//            }
//            System.out.println();
//        }


