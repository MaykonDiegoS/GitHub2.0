import classes.ChecklistItem;
import classes.ListaTarefas;
import classes.Tarefa;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a quantidade de tarefas da lista: ");
        ListaTarefas listaTarefas = new ListaTarefas(in.nextInt());
        in.nextLine();
        System.out.println("Informe um nome para a lista de tarefas");
        listaTarefas.setNomeLista(in.nextLine());

        while (true) {
            Tarefa tarefa = criarTarefa();
                    if(!listaTarefas.adicionarTarefa(tarefa)) {
                        System.out.println("Impossível adicionar tarefa!");
                        break;
                    }
            System.out.println("deseja adicionar mais itens? (S/N)");
            String add = in.nextLine();
            if (add.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static Tarefa criarTarefa() {
        Tarefa tarefa = new Tarefa();
        System.out.print("Informe o nome da tarefa: ");
        tarefa.setNome(in.nextLine());
        System.out.print("Informe a descrição da tarefa: ");
        tarefa.setDescricao(in.nextLine());
        System.out.print("Ordem da tarefa: ");
        tarefa.setOrdem(in.nextInt());
        in.nextLine();
        System.out.print("Tarefa tem checklist? (S/N)");
        String checklist = in.nextLine();

        if(checklist.equalsIgnoreCase("S")) {
            System.out.println("Informe o tamanho da checklist: ");
            tarefa.criarChecklist(in.nextInt());
            in.nextLine();

            while (true) {
                ChecklistItem item = new ChecklistItem();
                System.out.print("Informe um nome para o item: ");
                item.setNome(in.nextLine());
                System.out.print("Informe uma descrição para o item: ");
                item.setDescricao(in.nextLine());
                tarefa.adicionarChecklistItem(item);
                System.out.println("deseja adicionar mais itens? (S/N)");
                String add = in.nextLine();

                if(add.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }


        return tarefa;
    }
}
