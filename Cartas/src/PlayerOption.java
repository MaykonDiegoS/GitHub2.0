public enum PlayerOption {
    ;

    private final int value;
    private final String description;

    PlayerOption(int value, String description) {
        this.value = value;
        this.description = description;
    }

    //Getter


    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
