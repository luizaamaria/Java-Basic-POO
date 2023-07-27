package basicos;

public class Metodos {
    public static void main(String[] args) {
        System.out.println(calculaMedia(10, 20, 30));
        System.out.println(calculaMedia(1, 2, 3));
        System.out.println(calculaMedia(100, 200, 300));
    }

    public static double calculaMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }
}
