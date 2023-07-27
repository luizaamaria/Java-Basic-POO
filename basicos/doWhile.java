package basicos;
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaValores = 0; // acumula os valores digitados pelo usuário

        do {
            System.out.println("Digite um valor: ");
            int valor = scanner.nextInt();
            somaValores += valor;
            System.out.println("A soma dos valores é: " + somaValores);
        } while (somaValores < 100);
    }
}
