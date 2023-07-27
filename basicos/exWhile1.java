package basicos;

import java.util.Scanner;

public class exWhile1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalNotas = 0;
        int somadorNumeroNotas = 0;

        while(true) {
            System.out.println("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            if (nota == 0){
                break;
            }
            totalNotas += nota;
            somadorNumeroNotas += 1;
        }

        double mediaNotas = totalNotas / somadorNumeroNotas;
        System.out.println("Média das notas é: " + mediaNotas);

    }
}
