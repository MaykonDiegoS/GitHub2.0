package PairProgramming;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CodigoMorse {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //Definição do Código morse
        String[] codigoMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....",
                "--...", "---..", "----.", "-----", ".-.-.-",
                "--..--", "---...", "-....-", "..--..", "-.-.--",
                "*", "-.-.-.", ".----.", ".-..-.", "-...-", "-..-.", ".-.-."};

        //Definição de Caracteres
        String alfanumerico = "abcdefghijklmnopqrstuvwxyz1234567890.,:-?! ;'\"=/+";

        //Loop principal
        while (true) {
            System.out.println("Codificar ou Decodificar? C ou D");
            String codOuDecod = confereLetra("C", "D");

            if (codOuDecod.equalsIgnoreCase("C")) {
                codificar(alfanumerico, codigoMorse);
            } else {
                decodificar(alfanumerico, codigoMorse);
            }
            System.out.println("Continuar? S ou N");
            String continua = confereLetra("S", "N");
            if (continua.equalsIgnoreCase("N"))
                break;
        }
    }

    //Método para remover acentos
    public static String remover_acentos(String value) {
        String normalizer = Normalizer.normalize(value, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizer).replaceAll("");
    }

    //Método para conferir se letra é válida
    public static String confereLetra(String a, String b) {
        String continua;
        //Compara a letra inserida com as letras definidas anteriormente
        while (true) {
            continua = in.nextLine();
            if (continua.equalsIgnoreCase(a) || continua.equalsIgnoreCase(b)) {
                return continua;
            }
            System.err.println("Resposta inválida.");
            System.out.println("Escreva " + a + " ou " + b);
        }
    }

    //Método para o codificar o texto
    public static void codificar(String alfanumerico, String[] codigoMorse) {
        //Armazena texto informado
        System.out.println("Texto para codificar: ");
        String frase = in.nextLine();
        //Remove acento e deixa tudo minúsculo
        frase = remover_acentos(frase);
        frase = frase.toLowerCase();
        /*Percorre a String, compara os caracteres recebidos
        com os definidos anteriormente e imprimi o código correspondente*/
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < alfanumerico.length(); j++) {
                if (frase.charAt(i) == alfanumerico.charAt(j)) {
                    System.out.print(codigoMorse[j] + "|");
                }
            }
        }
        System.out.println("\n");
    }

    //Método para decodificar o código
    public static void decodificar(String alfanumerico, String[] codigoMorse) {
        //Armazena código informado
        System.out.println("Texto para decodificar: ");
        String frase = in.nextLine();
        //cria array sem pipe
        String[] chars = frase.split("\\|");
        //Percorre a array, compara ela com o código morse e imprime a letra correspondente
        for (String aChar : chars) {
            for (int j = 0; j < codigoMorse.length; j++) {
                if (aChar.equals(codigoMorse[j])) {
                    System.out.print(alfanumerico.charAt(j));
                }
            }
        }
        System.out.println("\n");
    }
}
