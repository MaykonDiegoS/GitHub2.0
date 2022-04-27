import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("Conversão de idade para dias");
        System.out.println("Quantos anos?");
        Scanner sc = new Scanner(System.in);
        int anos = sc.nextInt();

        System.out.println("Quantos meses");
        Scanner sc1 = new Scanner(System.in);
        int meses = sc1.nextInt();

        System.out.println("Quantos dias");
        Scanner sc2 = new Scanner(System.in);
        int dias = sc2.nextInt();

        System.out.println("Você já viveu por " + ((anos*365) + (meses*30) + dias) + " dias");


    }
}
