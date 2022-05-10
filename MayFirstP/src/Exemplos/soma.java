package Exemplos;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {System.out.println("Número:");
            int num = sc.nextInt();
            int fatorial = 0;
            for(int i = 0; i < num; i++) {
                fatorial += i;
            }
            System.out.println(fatorial);
            if (num == 0) {
                break;
            }
        }
    }
}
