package basicos;

import java.util.Scanner;

public class exFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto scanner que consegue ler o que digitamos no console

        double somadorNotas = 0;
        System.out.println("Digite as notas do aluno: ");

        for(int i = 0; i < 4; i++) { // i++ é a mesma coisa que i = i + 1, faz com que o for seja executado 4 vezes
            double nota = scanner.nextDouble(); // consegue ler um double e converter para double
            somadorNotas += nota; // somadorNotas = somadorNotas + nota, faz a soma das notas digitadas pelo usuário e armazena na variável somadorNotas
        }

        double media = somadorNotas / 4;

        System.out.println("A média do aluno é: " + media);
    }
}
