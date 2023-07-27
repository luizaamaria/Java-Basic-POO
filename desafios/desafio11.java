package desafios;

import java.util.Scanner;

public class desafio11 {
    public static void main(String[] args) {
        int contadorSim = interrogatorio();
        classifiqueInterrogado(contadorSim);
    }

    public static void classifiqueInterrogado(int contadorSim) {
        if(contadorSim == 0 || contadorSim == 1) {
            System.out.println("Inocente");
        }else if(contadorSim == 2) {
            System.out.println("Suspeita");
        }else if(contadorSim == 3 || contadorSim == 4) {
            System.out.println("Cúmplice");
        }else if(contadorSim == 5) {
            System.out.println("Assassino");
        }
    }

    public static int interrogatorio() {
        Scanner scanner = new Scanner(System.in);

        int contadorSim = 0;

        System.out.println("Telefonou para a vítima? ");
        int pergunta1 = scanner.nextInt();
        if(pergunta1 == 1) {
            contadorSim += 1 ;
        }

        System.out.println("Esteve no local do crime? ");
        int pergunta2 = scanner.nextInt();
        if(pergunta2 == 1) {
            contadorSim += 1 ;
        }

        System.out.println("Mora perto da vítima? ");
        int pergunta3 = scanner.nextInt();
        if(pergunta3 == 1) {
            contadorSim += 1 ;
        }

        System.out.println("Devia para a vítima? ");
        int pergunta4 = scanner.nextInt();
        if(pergunta4 == 1) {
            contadorSim += 1 ;
        }

        System.out.println("Já trabalhou com a vítima? ");
        int pergunta5 = scanner.nextInt();
        if(pergunta5 == 1) {
            contadorSim += 1 ;
        }

        return contadorSim;

    }
}
