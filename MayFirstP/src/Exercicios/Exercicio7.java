package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        double percenDistr = 28;
        double imposto = 45;

        System.out.println("Qual o custo de fábrica?");
        Scanner sc = new Scanner(System.in);
        Double custoFab = sc.nextDouble();

        Double custototal = custoFab * ((imposto/100.0) + (percenDistr/100)+1.0);


        System.out.println("O custo do carro será de R$" + custototal);
    }
}
/*
carro novo = custoF + percentualD
custoF = custo de fábrica mais impostos

percentualD = 28%
Imposto = 45%


 */