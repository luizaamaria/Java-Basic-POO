import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        String nome = "Luiza";
        String sobrenome = "Maria";
        int idade = 23;
        final String matricula = "078392";
        String nomePai = "João";
        String nomeMae = "Maria";
        boolean temAutorizacao = true;

//        System.out.println(nome);
//        System.out.println(sobrenome);
//        System.out.println(idade);;
//        idade = 25;
//        System.out.println(idade);
//        System.out.println(matricula);
//        System.out.println(nomePai);
//        System.out.println(nomeMae);
//        System.out.println(temAutorizacao);

//        entradaUsuario();
        saudar(nome);

        List<String> responsaveisAlunos = new ArrayList<>(Arrays.asList("João", "Maria"));  // Cria uma lista de Strings
        System.out.println(responsaveisAlunos.get(0));  // Converte a lista para um array e imprime

        responsaveisAlunos = adicionarResponsavel(responsaveisAlunos, "José");
        responsaveisAlunos = adicionarResponsavel(responsaveisAlunos, "Lu");
        responsaveisAlunos = editarResponsavel(responsaveisAlunos, "Luiza",1);
        responsaveisAlunos = removeResponsavel(responsaveisAlunos);
        responsaveisAlunos = ordenaResponsavel(responsaveisAlunos);

        System.out.println(Arrays.toString(responsaveisAlunos.toArray()));  // Converte a lista para um array e imprime

        exibeResponsaveis(responsaveisAlunos);
    }

    public static void exibeResponsaveis(List<String> responsaveisAlunos) {
        for (int i = 0; i < responsaveisAlunos.size(); i++) {
            System.out.println((i + 1) + ")"  + responsaveisAlunos.get(i));
        }
    }

    public static List<String> adicionarResponsavel(List<String> responsaveisAlunos, String nomeResponsavel) {
        responsaveisAlunos.add(nomeResponsavel);
        return responsaveisAlunos;
    }

    public static List<String> editarResponsavel(List<String> responsaveisAlunos, String nomeResponsavel, int index) {
        responsaveisAlunos.set(index, nomeResponsavel);
        return responsaveisAlunos;
    }

    public static List<String> removeResponsavel(List<String> responsaveisAlunos) {
        responsaveisAlunos.remove(responsaveisAlunos.size() - 1);
        return responsaveisAlunos;
    }

    public static List<String> ordenaResponsavel(List<String> responsaveisAlunos) {
        responsaveisAlunos.sort(null);
        return responsaveisAlunos;
    }

    public static void saudar(String nome) {
        String saudacao = "Olá, " + nome + "!";
        System.out.println(saudacao);
    }

    public static String informaResultado(double media, String nome){
        return (media >= 7 ?
                "O aluno " + nome + " está aprovado com média " + media :
                "O aluno " + nome + " está reprovado com média " + media);
    }

    public static double calculaMedia(double somatorioNotas, int numeroNotas) {
        double media = somatorioNotas / numeroNotas;
        return media;
    }

    public static void entradaUsuario() {
        Scanner scanner = new Scanner(System.in);

        double somadorNotas = 0;
        int somadorNumeroNotas = 0;

        while(true) {
            System.out.println("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            if (nota == 0){
                break;
            }
            somadorNotas += nota;
            somadorNumeroNotas += 1;
        }

        double media = calculaMedia(somadorNotas, somadorNumeroNotas);
        System.out.println(informaResultado(media, "Luiza"));
    }
}



