package Exemplos;

import javax.swing.*;
import java.util.Scanner;

public class desafio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 91352;
        int count = 0;

        while(true) {
            System.out.println("Pin: (5 dígitos)");
            int pin1 = sc.nextInt();

            if(pin1 == pin){
                System.out.println("Acesso permitido. Entrando...!");
              break;
            }
            count += 1;

            if (count == 3) {
                System.err.println("Você excedeu o limite, vá para o banco!");
                break;
            }
            System.err.println("Pin incorreto, você tem mais " + (3-count) + " tentativas");
            }
        }
        }
// Escrever um algoritmo que cheque se um pin é válido para ele executar uma ação imaginária
//3 tentativas
//5 números
