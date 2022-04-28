import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Horas trabalhadas em um mês: ");
        double horasTrabalhadas = sc.nextInt();
        System.out.println("Salário por hora: ");
        double valorHora = sc.nextDouble();
        int horaMensal = 160;


        if (horasTrabalhadas > horaMensal) {
            double valorHoraExtra = valorHora * (1 + 0.5) * (horasTrabalhadas - horaMensal);
            System.out.printf("Salário do mês: R$%.2f", ((horasTrabalhadas * valorHora) + valorHoraExtra));
        }
       else {
            System.out.printf("Salário do mês: R$%.2f", (valorHora * horasTrabalhadas));
        }

    }
}
