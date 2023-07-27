package desafios;

import java.util.Scanner;

public class desafio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalTemperaturas = 0; // total de temperaturas que o usuário informou
        int somaTemperatura = 0; // soma das temperaturas que o usuário informou

        while (true){ // enquanto for verdadeiro
            System.out.println("Informe a temperatura: "); // vai perguntar a temperatura
            double temperatura = scanner.nextDouble(); // vai ler a temperatura e armazenar na variável temperatura

            if (temperatura == 0){ // se a temperatura for igual a 0
                break; // o loop vai parar
            }

            totalTemperaturas += temperatura; // totalTemperaturas = totalTemperaturas + temperatura
            somaTemperatura += 1; // somaTemperatura = somaTemperatura + 1
        }

        double mediaTemperatura = totalTemperaturas / somaTemperatura; // mediaTemperatura = totalTemperaturas / somaTemperatura
        System.out.println("A média das temperaturas é: " + mediaTemperatura);
    }
}
