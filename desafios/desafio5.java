package desafios;

public class desafio5 {
    public static void main(String[] args) {
        String cargo = "professor ensino média";

        switch(cargo) {
            case "professor ensino infantil 1":
                System.out.println("O salário é: R$ 4.000,00");
                break;
            case "professor ensino infantil 2":
                System.out.println("O salário é: R$ 5.000,00");
                break;
            case "professor ensino fundamental 1":
                System.out.println("O salário é: R$ 6.000,00");
                break;
            case "professor ensino fundamental 2":
                System.out.println("O salário é: R$ 7.000,00");
                break;
            case "professor ensino média":
                System.out.println("O salário é: R$ 8.000,00");
                break;
            default:
                System.out.println("valor inválido");
        }
    }

}
