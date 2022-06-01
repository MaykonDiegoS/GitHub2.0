import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();

        System.out.print("Nome da tarefa: ");
        tarefa.setNome(in.nextLine());
        System.out.print("Descrição: ");
        tarefa.setDescricao(in.nextLine());

        System.out.println(tarefa.getUuid());
        System.out.println(tarefa.getNome() + ": " + tarefa.getDescricao());

    }
}
