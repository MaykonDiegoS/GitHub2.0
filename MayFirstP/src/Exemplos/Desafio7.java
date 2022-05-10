package Exemplos;
import java.util.Scanner;

public class Desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true)
        {System.out.println("Número:");
        int num = sc.nextInt();
        int fatorial = 1;
            for(int i = num; i >0; i--) {
                fatorial *= i;
            }
            System.out.println(fatorial);
            if (num == 0) {
                break;
            }
        }
    }
}

