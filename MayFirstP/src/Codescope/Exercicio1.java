package Codescope;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which exercise?");
        int exercise = sc.nextInt();
        switch (exercise) {
            case 1:
            System.out.println("Is it a square or a rectangle?");
            System.out.println("Enter Length?");
            double leng = sc.nextDouble();
            System.out.println("Enter breadth?");
            double brea = sc.nextDouble();
            if (leng == brea) {
                System.out.println("It's a square!");
            }
            else {
                System.out.println("It's a rectangle!");
            }
            case 2:
                System.out.println("Which number is the greatest?");
                System.out.println("Write a number:");
                double num1 = sc.nextDouble();
                System.out.println("Now write a new number:");
                double num2 = sc.nextDouble();

                if (num1 > num2) {
                    System.out.println(num1 + " is the greatest number.");
                }
                else {
                    System.out.println(num2 + " is the greatest number");
                }
            case 3:
                System.out.println("Will you have a discount?");
                System.out.println("Enter the quantity of unit: ");
                int unit = sc.nextInt();
                int price = 100;
                int tprice = unit * price;

                if (tprice > 1000) {
                    System.out.println("The total cost is US$" + (tprice - (0.1 * tprice)));
                }
                else {
                    System.out.println("The total cost is US$" + tprice);
                }
            case 4:
                System.out.println("Will you have a bonus?");
                System.out.println("Enter salary: ");
                double salary = sc.nextDouble();
                System.out.println("Enter year(s) of service: ");
                int years = sc.nextInt();

                if (years > 5) {
                    System.out.printf("Your bonus is US$%.2f", (0.05 * salary));
                }
                else {
                    System.out.println("Unfortunaly you still won't have a bonus!");
                }
            case 5:

        }

    }
}
