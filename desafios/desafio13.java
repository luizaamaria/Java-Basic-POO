package desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class desafio13 {
    public static void main(String[] args) {
        List<Integer> bancoDeHoras = new ArrayList<>(Arrays.asList(80, 38, 48, 8, 9, 10, 11, 7, 5));

        int somaHoras = somatoriaHoras(bancoDeHoras);
        informaRelatorio(somaHoras);
    }
    public static int somatoriaHoras(List<Integer> bancoDeHoras) {
        int somatoria = 0;


        for (int i = 0; i < bancoDeHoras.size(); i++) {
            somatoria += bancoDeHoras.get(i);
        }
        return somatoria;
    }

    public static void informaRelatorio(int somaHoras) {
        if (somaHoras > 160) {
            System.out.println("Você recebe o valor de: " + (somaHoras - 160) + " horas extras.");
        } else if (somaHoras == 160) {
            System.out.println("Deve receber o salário normal.");
        } else {
            System.out.println("Deve repor: " + (160 - somaHoras) + " horas extras.");
        }
    }
}
