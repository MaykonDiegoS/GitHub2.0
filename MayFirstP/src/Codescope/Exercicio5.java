package Codescope;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your grade?");
        int x = sc.nextInt();

        if (x < 25) {
            System.out.println("It's a F");
        } else if (x > 25 && x < 45) {
            System.out.println("It's an E");
        } else if (x > 45 && x < 50) {
            System.out.println("It's a D");
        } else if (x > 50 && x < 60) {
            System.out.println("It's a C");
        } else if (x > 60 && x < 80) {
            System.out.println("It's a B");
        } else {
            System.out.println("It's an A");
        }
    }
}
