package org.example.fatorial;

public class Fatorial {
    private Fatorial() {
    }

    public static int calcular(int valor) {
        var fatorial = 1;

        for (int i = 1; i <= valor; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
