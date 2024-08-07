package org.example.votos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VotosResolve {

    private final BigDecimal CEM_PORCENTO = new BigDecimal("100");

    private final BigDecimal totalEleitores;
    private final BigDecimal validos;
    private final BigDecimal brancos;
    private final BigDecimal nulos;

    public VotosResolve(int totalEleitores, int validos, int brancos, int nulos) {
        this.totalEleitores = new BigDecimal(totalEleitores);
        this.validos = new BigDecimal(validos);
        this.brancos = new BigDecimal(brancos);
        this.nulos = new BigDecimal(nulos);
    }

    public String validos() {
        System.out.println("::: Percentual de votos VALIDOS em relação ao total de eleitores :::");
        System.out.println("VALIDOS: " + validos + " | TOTAL: " + totalEleitores);
        verificarInconsistencia();

        var resultado = validos.multiply(CEM_PORCENTO).divide(totalEleitores, 2, RoundingMode.HALF_UP);
        return resultado + "%";
    }

    public String brancos() {
        System.out.println("::: Percentual de votos BRANCOS em relação ao total de eleitores :::");
        System.out.println("BRANCOS: " + brancos + " | TOTAL: " + totalEleitores);
        verificarInconsistencia();

        var resultado = brancos.multiply(CEM_PORCENTO).divide(totalEleitores, 2, RoundingMode.HALF_UP);

        return resultado + "%";
    }

    public String nulos() {
        System.out.println("::: Percentual de votos NULOS em relação ao total de eleitores :::");
        System.out.println("NULOS: " + nulos + " | TOTAL: " + totalEleitores);
        verificarInconsistencia();

        var resultado = nulos.multiply(CEM_PORCENTO).divide(totalEleitores, 2, RoundingMode.HALF_UP);

        return resultado + "%";
    }

    private void verificarInconsistencia() {
        var somatorio = nulos.add(brancos).add(validos);

        if (!totalEleitores.equals(somatorio)) {
            throw new RuntimeException("Inconsistência de valores. A quantidade total de eleitores não batem com os votos!");
        }
    }
}
