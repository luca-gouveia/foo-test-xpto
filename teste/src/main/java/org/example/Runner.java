package org.example;

import org.example.bubble.BubbleSort;
import org.example.bubble.util.ListaAleatoria;
import org.example.votos.VotosResolve;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    private static String scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolher Desafio (1-4):");
        return scanner.nextLine();
    }

    public static void run() {
        String resposta = null;

        while (!Arrays.asList("1", "2", "3", "4").contains(resposta)) {
            resposta = scan();
        }

        if (resposta.equals("1")) {
            System.out.println("--- Votos em relação ao total de eleitores ---");
            var votos = new VotosResolve(1000, 800, 150, 50);
            System.out.println(votos.validos());
            System.out.println(votos.brancos());
            System.out.println(votos.nulos());
        } else if (resposta.equals("2")) {
            System.out.println("--- Bubble Sort ---");
            var array = ListaAleatoria.listaInt(5);
            System.out.println(Arrays.toString(array));
            System.out.println("> " + Arrays.toString(BubbleSort.ordenar(array)));
        }


    }
}
