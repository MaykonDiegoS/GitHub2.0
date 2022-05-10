package Exemplos;

import java.util.Scanner;

public class Desafio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabuleiro = {{'-','-','-'},{'-','-','-'},{'-','-','-'}};

        boolean isCross = false;
            while (true) {
                int pos;
                if(isCross) {
                    System.out.println("Informe um valor para x");
                    pos = sc.nextInt();
                } else {
                    System.out.println("Informe um valor para o");
                    pos = sc.nextInt();
                }

                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++){
                        System.out.print(tabuleiro[i][j]);
                    }
                    System.out.println();
                }
            }

        }
    }
