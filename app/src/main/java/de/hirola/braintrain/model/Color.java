package de.hirola.braintrain.model;

public enum Color {
    RED(0), YELLOW(1), BLUE(2), GREEN(3);

    private final int value;
    Color(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
