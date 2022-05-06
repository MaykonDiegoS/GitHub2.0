package Codescope;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Absolute value: " + ((-1) * x));
        }
        else {
            System.out.println("Absolute value " + x);
        }
    }
}
