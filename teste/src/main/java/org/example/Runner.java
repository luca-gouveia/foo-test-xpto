package org.example;

import org.example.bubble.BubbleSort;
import org.example.bubble.util.ListaAleatoria;
import org.example.fatorial.Fatorial;
import org.example.multiplos.Multiplo;
import org.example.votos.VotosResolve;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    private static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolher Desafio (1-4):");
        return scanner.nextInt();
    }

    public static void run() {
        int resposta = 0;

        while (!Arrays.asList(1,2,3,4).contains(resposta)) {
            resposta = scan();
        }

        if (resposta == 1) {
            System.out.println("--- Votos em relação ao total de eleitores ---");
            var votos = new VotosResolve(1000, 800, 150, 50);
            System.out.println(votos.validos());
            System.out.println(votos.brancos());
            System.out.println(votos.nulos());
        } else if (resposta == 2) {
            System.out.println("--- Bubble Sort ---");
            var array = ListaAleatoria.listaInt(5);
            System.out.println(Arrays.toString(array));
            System.out.println("> " + Arrays.toString(BubbleSort.ordenar(array)));
        } else if (resposta == 3) {
            System.out.println("--- Fatorial ---");
            Scanner scanner = new Scanner(System.in);
            System.out.println("calcular fatorial de:");
            int valor = Integer.parseInt(scanner.nextLine());;
            System.out.println(Fatorial.calcular(valor));
        } else if (resposta == 4) {
            System.out.println("--- Multiplos 3 ou 5 ---");
            Scanner scanner = new Scanner(System.in);
            System.out.println("lista soma dos multiplos até:");
            int valor = Integer.parseInt(scanner.nextLine());;
            System.out.println("SOMA: " + Multiplo.recuperarMultiploSoma_TRES_CINCO(valor));
        }
    }
}
