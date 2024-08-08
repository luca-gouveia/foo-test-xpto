package org.example.bubble.util;

import java.util.Random;

public class ListaAleatoria {
    private ListaAleatoria() {
    }

    public static int[] listaInt(int tamanho) {
        var lista = new int[tamanho];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Random().nextInt(100);
        }

        return lista;
    }

    public static double[] listaDouble(int tamanho) {
        var lista = new double[tamanho];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = new Random().nextDouble(100);
        }

        return lista;
    }
}
