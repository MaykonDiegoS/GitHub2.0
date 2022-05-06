import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isHealer = true;
        while (isHealer) {
            System.out.println("Informe a abreviação de Classe");
            String clazz = sc.next();
            if (clazz.length() != 3) {
                System.err.println("Abreviações devem possuir três letras.");
                continue;
            }
                switch (clazz.toUpperCase()) {
                    case "WHM", "SAG", "AST", "SCH":
                        System.out.println("É HEALER");
                        break;
                    case "PLD", "WAR", "DKN", "GNB":
                        System.out.println("É TANK");
                        break;
                    case "MNK", "DRG", "NJA", "SMR", "RPR", "BRD", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                        System.out.println("É DPS");
                        break;
                    default:
                        System.out.println("Não é nenhuma classe");
                        isHealer = false;
                        break;
            }
        }
    }
}