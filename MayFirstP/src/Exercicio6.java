import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("Qual é o seu salário atual?");
        Scanner sc = new Scanner(System.in);
        Double salário = sc.nextDouble();

        System.out.println("Qual é o seu reajuste percentual?");
        Scanner sc1 = new Scanner(System.in);
        Double reajuste = sc1.nextDouble();

        Double valComReajuste = salário*((reajuste/100)+1);

        System.out.println("Você começará a ganhar R$" + valComReajuste + " por mês");
    }
}
/*
Sálario mensal
reajuste percentual

 */