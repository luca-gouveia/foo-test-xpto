package org.example.bubble;

public class BubbleSort {
    private BubbleSort() {
    }

    public static int[] ordenar(int[] array) {
        var aindaTroca = true;
        while (aindaTroca) {
            aindaTroca = false;
            for (int b = 0; b < (array.length - 1); b++) {
                if (array[b] > array[b + 1]) {
                    aindaTroca = true;
                    var aux = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = aux;
                }
            }
        }

        return array;
    }
    public static double[] ordenar(double[] array) {
        var aindaTroca = true;
        while (aindaTroca) {
            aindaTroca = false;
            for (int b = 0; b < (array.length - 1); b++) {
                if (array[b] > array[b + 1]) {
                    aindaTroca = true;
                    var aux = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = aux;
                }
            }
        }

        return array;
    }
}
