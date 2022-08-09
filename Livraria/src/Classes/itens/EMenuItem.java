package Classes.itens;

public enum EMenuItem implements IMenu{

    VOLTAR(0, "Voltar"),
    AVALIAR_ITEM(1, "Avaliar item"),
    VER_AVALIACOES(2, "Ver avaliações"),
    MOSTRAR_DETALHES(3, "Mostrar Detalhes"),
    ADICIONAR_ESTANTE(4, "Adicionar estante");

    private final int valorOpcao;
    private final String descricao;
    EMenuItem(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }

    public static EMenuItem getByValorOpcao(int escolha) {
        for (EMenuItem e : EMenuItem.values()) {
            if (e.getValorOpcao() == escolha) {
                return e;
            }
        }
        return null;
    }

    public int getValorOpcao() {
        return this.valorOpcao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
