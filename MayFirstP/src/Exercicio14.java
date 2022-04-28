import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra se pode votar esse ano");

        System.out.println("Em que ano você nasceu?");
        int ano = sc.nextInt();
        System.out.println("Qual o ano atual?");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - ano;

        if (idade < 16) {
            System.out.println("Você ainda não pode votar ano!");
        }
        else {
            System.out.println("Vocâ já pode votar esse ano");
        }
    }
}
