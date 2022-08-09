package Testes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainTestes {

    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ex2();
    }

    public static void ex1() {
        LocalDateTime inicio = LocalDateTime.of(2022, 7, 7, 8, 3, 32);
        LocalDateTime fim = LocalDateTime.of(2022, 7, 7, 18, 25, 32);
        Duration bet = Duration.between(inicio, fim).minusHours(1).minusMinutes(30);
        System.out.println(bet);
        System.out.printf("%d:%d:%d\n", bet.toHoursPart(), bet.toMinutesPart(), bet.toSecondsPart());
    }
    public static void ex2() {
        while (true) {
            try {
                System.out.print("Informe um número: ");
                System.out.println(in.nextInt());
            } catch (InputMismatchException e) {
                in.nextLine();
                System.err.println("não é um número!");
            } catch (NoSuchElementException e2) { 
            }
        }
    }
}
