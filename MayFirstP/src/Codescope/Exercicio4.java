package Codescope;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Will you have a bonus?");
        System.out.println("Enter salary: ");
        double x = sc.nextDouble();
        System.out.println("Enter year(s) of service: ");
        int y = sc.nextInt();

        if (y > 5) {
            System.out.printf("Your bonus is US$%.2f", (0.05 * x));
        }
        else {
            System.out.println("Unfortunaly you still won't have a bonus!");
        }
    }
}
