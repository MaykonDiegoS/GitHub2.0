import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salário fixo: ");
        double salario = sc.nextDouble();
        System.out.println("Valor vendas: ");
        double valorVendas = sc.nextDouble();

        if (valorVendas < 1500) {
            System.out.printf("Seu salário total: R$%.2f", ((0.03 * valorVendas) + salario));
        }
        else {
            System.out.printf("Seu salário total: R$%.2f", (0.05 * valorVendas) + salario);
        }
    }
}
