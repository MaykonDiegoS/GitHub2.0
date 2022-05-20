package PairProgramming;
import java.util.Scanner;

public class Atividade1 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //Leitura das quantidades
        System.out.println("Recuperação anual!");
        System.out.println("Quantidade de alunos na turma: ");
        int quantidadeAlunos = in.nextInt();
        System.out.println("Quantidade de questões da prova: ");
        int quantidadeQuestoes = in.nextInt();
        in.nextLine();
        //Declaração de variáveis
        String[] nomesAlunos = new String[quantidadeAlunos];
        String[] gabarito = new String[quantidadeQuestoes];
        String[] respostaAlunos = new String[quantidadeQuestoes];
        double[] notasFinais = new double[quantidadeAlunos];

        //Preenche o gabarito
        System.out.println("Preencha o gabarito: ");
        preencheResposta(gabarito);
        for (int i = 0; i < quantidadeAlunos; i++) {

            //Armazena aluno e resposta
            System.out.println("Nome do aluno: ");
            String nomeAluno = in.nextLine();
            nomesAlunos[i] = nomeAluno;
            System.out.println("Preencha com as suas respostas: ");
            preencheResposta(respostaAlunos);

            //Confere acertos
            int acertos = 0;
            for (int j = 0; j < gabarito.length; j++) {
                if (gabarito[j].equals(respostaAlunos[j])) {
                    acertos++;
                }
            }
            //Calcula a nota
            double notaFinal = acertos * (10.0 / quantidadeQuestoes);
            notasFinais[i] = notaFinal;
        }
        //Imprime o nome e a nota final
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Nome: " + nomesAlunos[i]);
            System.out.println("Nota: " + notasFinais[i]);
            System.out.println();
        }
    }

    public static void preencheResposta(String[] respostas) {
        //Preenche array e verifica se é letra
        for (int i = 0; i < respostas.length; i++) {
            while (true) {
                System.out.println("Questão " + (i + 1) + ": ");
                respostas[i] = in.nextLine();
                respostas[i] = respostas[i].toUpperCase();
                int numero = respostas[i].charAt(0);
                if (numero < 65 || numero > 90) {
                    System.out.println("Dígito inválido!");
                    continue;
                }
                break;
            }
        }
    }
}