public enum ValorCarta {

    ÁS("Ás"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    DEZ("10"),
    VALETE("J"),
    DAMAS("Q"),
    REIS("K");

    private final String valor;
    ValorCarta(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return this.valor;
    }
}
