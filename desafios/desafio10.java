package desafios;

import java.util.Scanner;

public class desafio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do litro: ");

        double valorLitro = scanner.nextDouble();
        double valorTotal = 0;

        for (int i = 1; i <= 50; i++) {
            valorTotal += valorLitro * 1;

            System.out.println("Valor do litro: " + valorLitro + " Quantidade de litros: " + i + " Valor total: " + valorTotal);

        }
    }
}
