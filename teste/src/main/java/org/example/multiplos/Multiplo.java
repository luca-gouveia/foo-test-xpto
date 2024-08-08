package org.example.multiplos;

import java.util.ArrayList;

public class Multiplo {

    private static final int TRES = 3;
    private static final int CINCO = 5;

    private Multiplo() {
    }

    public static int recuperarMultiploSoma_TRES_CINCO(int valor) {
        StringBuilder lista = new StringBuilder();
        var soma = 0;

        for (int i = 1; i < valor; i++) {
            if ((i % TRES == 0) || (i % CINCO == 0)) {
                lista.append(i).append(" ");
                soma += i;
            }
        }

        System.out.println("Múltiplos: " + lista);

        return soma;
    }
}
