package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class desafio12 {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>(Arrays.asList(9.0, 9.8, 6.5, 4.5, 7.5));
        exibeNotas(notas);
    }

    public static void exibeNotas(List<Double> notas) {
        int contadorAprovado = 0;
        int contadorReprovado = 0;

        for (int i = 0; i < notas.size(); i++) {
            if(notas.get(i) >= 7) {
                contadorAprovado++;
            } else {
                contadorReprovado++;
            }
        }
        System.out.println("Quantidade de aprovados: " + contadorAprovado);
        System.out.println("Quantidade de reprovados: " + contadorReprovado);
    }
}
