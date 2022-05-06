package Codescope;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Will you have a discount?");
        System.out.println("Enter the quantity of unit: ");
        int x = sc.nextInt();
        int y = 100;
        int z = x * y;

        if (z > 1000) {
            System.out.println("The total cost is US$" + (z - (0.1 * z)));
        }
        else {
            System.out.println("The total cost is US$" + z);
        }
    }
    }
