package desafios;

public class desafio7 {
    public static void main(String[] args) {

        int tempoCorredor1 = 8;
        int tempoCorredor2 = 7;
        int tempoCorredor3 = 9;


        if(tempoCorredor1 < tempoCorredor2 && tempoCorredor1 < tempoCorredor3) {
            System.out.println("Corredor 1 venceu a prova");
        } else if (tempoCorredor2 < tempoCorredor1 && tempoCorredor2 < tempoCorredor3) {
            System.out.println("Corredor 2 venceu a prova");
        } else {
            System.out.println("Corredor 3 venceu a prova");
        }
    }
}
