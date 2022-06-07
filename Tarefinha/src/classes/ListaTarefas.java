package classes;

public class ListaTarefas {
    private int tamanhoLista;
    private String nomeLista;
    private Tarefa[] tarefas;
    private int ordem;

    public ListaTarefas(int tamanhoLista) {
        this.setTamanhoLista(tamanhoLista);
        this.setTarefas(new Tarefa[tamanhoLista]);
    }

    public boolean adicionarTarefa(Tarefa tarefa) {
        if(tarefa.getOrdem() < 0 ||
                tarefa.getOrdem() > this.getTamanhoLista()) {
            return false;
        }
        for(int i = 0; i < this.getTamanhoLista(); i++) {
            if (this.getTarefas()[i] == null) {
                this.getTarefas()[i] = tarefa;
                return true;
            } else if(this.getTarefas()[i].getOrdem() == tarefa.getOrdem()) {

            }
        }
        return false;
    }

    public Tarefa buscarTarefa(int ordem) {
        for(Tarefa tarefa: this.getTarefas()) {
            if( tarefa != null && tarefa.getOrdem() == ordem) {
                return tarefa;
            }
        }
        return null;
    }

    public boolean alterarOrdemTarefa(int antigaOrdem, int novaOrdem) {
        Tarefa tarefaAntiga = buscarTarefa((antigaOrdem));
        Tarefa novaTarefa = buscarTarefa(novaOrdem);

        if(tarefaAntiga == null || novaTarefa == null) {
            return false;
        }

        tarefaAntiga.setOrdem(novaOrdem);
        novaTarefa.setOrdem((antigaOrdem));
        return true;
    }

    // GETTER & SETTER

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getOrdem() {
        return this.ordem;
    }
}

