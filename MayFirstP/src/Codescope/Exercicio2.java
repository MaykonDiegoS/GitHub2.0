package Codescope;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which number is the greatest?");
        System.out.println("Write a number:");
        double x = sc.nextDouble();
        System.out.println("Now write a new number:");
        double y = sc.nextDouble();

        if (x > y) {
            System.out.println(x + " is the greatest number.");
        }
        else {
            System.out.println(y + " is the greatest number");
        }
    }

}
