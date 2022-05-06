package Codescope;

import java.util.Scanner;

public class Exloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Número: ");
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(x + " * " + i + " = " + (x * i));
            }
        }
    }
}
