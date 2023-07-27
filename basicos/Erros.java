package basicos;

public class Erros {
    public static void main(String[] args) {
        try {
            informaResultado("Luiza", null);
        }catch (NullPointerException e){
            System.out.println("Ocorreu um erro ao executar o método informaResultado" + e.getMessage());
        }finally {
            System.out.println("Fim da execução");
        }
    }
    public static void informaResultado(String nomeAluno, Double mediaFinal){
        if(mediaFinal >= 7){
            System.out.println("O aluno " + nomeAluno + " está aprovado com média " + mediaFinal);
        } else {
            System.out.println("O aluno " + nomeAluno + " está reprovado com média " + mediaFinal);
        }
    }
}
