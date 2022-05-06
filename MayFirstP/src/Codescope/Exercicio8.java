package Codescope;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of classes held: ");
        double held = sc.nextInt();
        System.out.println("Number of classes attended: ");
        double attended = sc.nextInt();

        double attendence = ((attended / held) * 100);

        if (attendence > 75) {
            System.out.println("You're allowed to sit");
        }
        else {
            System.out.println("You're not allowed to sit");
            System.out.println(attendence);
        }
    }
}
