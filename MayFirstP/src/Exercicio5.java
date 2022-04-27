import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("Qual foi o número total de eleitores?");
        Scanner sc = new Scanner(System.in);
        double eleitores = sc.nextInt();

        System.out.println("Qual foi o número de votos nulos?");
        Scanner sc1 = new Scanner(System.in);
        double votosNulos = sc1.nextInt();

        System.out.println("Qual foi o número de votos nulos?");
        Scanner sc2 = new Scanner(System.in);
        double votosEmBranco = sc2.nextInt();

        double válidos = (eleitores - votosNulos - votosEmBranco);

        System.out.println("O total de voto válido foi de " + válidos + "eleitores");
        System.out.println("Percentual de tipos de votos em relação ao número de eleitores" );
        System.out.println("O percentual de votos válido é de " + new DecimalFormat("0.00").format((válidos/eleitores)*100) + "%");
        System.out.println("O percentual de votos nulos é de " + new DecimalFormat("0.00").format((votosNulos/eleitores)*100) + "%");
        System.out.println("O percentual de votos em branco é de " + new DecimalFormat("0.00").format((votosEmBranco/eleitores)*100) + "%");

    }

}
/*número total de eleitores
número de votos nulos
número de votos em branco

Calcular total de voto válido
Calcular Percentual voto válido, nulo e branco
representa em relação ao total de eleitores
 */