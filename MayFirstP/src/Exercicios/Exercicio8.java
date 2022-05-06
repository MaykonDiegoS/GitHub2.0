package Exercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o salário fixo?");
        Double salario = sc.nextDouble();
        System.out.println("Qual a comissão fixa?");
        Double comiss = sc.nextDouble();
        double percentualVenda = 5;
        System.out.println("Total de carros vendidos: ");
        Double totalCarro = sc.nextDouble();
        System.out.println("Valor total de vendas");
        Double valorT = sc.nextDouble();

        Double comissao = comiss * totalCarro;
        Double valorTotal = percentualVenda/100*valorT;

        System.out.println("O salário final do vendedor é de R$" + (salario + comissao + valorTotal));
    }
}
/*
Salário fixo
comissão fixa para cada carro vendido
5% do valor da vendas

carros vendidos
valor total de vendas =
salário fixo = salario
valor por carro vendido = comissao

salário final
 */