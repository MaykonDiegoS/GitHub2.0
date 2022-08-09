public enum Naipe {
    ESPADAS("♠"),
    PAUS("♣"),
    COPAS("♥"),
    OUROS("♦");

    private final String naipe;

    Naipe(String naipe) {
        this.naipe = naipe;
    }

    public String getNaipe() {
        return this.naipe;
    }
}
