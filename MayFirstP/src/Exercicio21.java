import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número da conta: ");
        String conta = sc.nextLine();
        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Débito: ");
        double debito = sc.nextDouble();
        System.out.println("Crédito: ");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        if (saldoAtual < 0) {
            System.out.printf("Saldo atual: R$%.2f\nSaldo negativo", saldoAtual);
        }
        else {
            System.out.printf("Saldo atual: R$%.2f\nSaldo positivo", saldoAtual);
        }
    }
}
