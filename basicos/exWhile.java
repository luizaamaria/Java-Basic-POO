package basicos;
import java.util.Scanner;

public class exWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaValores = 0; // acumula os valores digitados pelo usuário

        while (somaValores < 100) { // enquanto a soma dos valores for menor que 100, o while será executado
            System.out.println("Digite um valor: ");
            int valor = scanner.nextInt(); // consegue ler um inteiro e converter para inteiro
            somaValores += valor; // faz a soma dos valores digitados pelo usuário e armazena na variável somaValores
            System.out.println("A soma dos valores é: " + somaValores);
        }
    }
}
