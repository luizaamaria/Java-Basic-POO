package poo;

public class Professor extends Pessoa {
    public String disciplina;
    public int horas;
    Professor(String nome, String sobrenome, int idade, String cpf, String disciplina, int horas) {
        super(nome, sobrenome, idade, cpf);
        this.disciplina = disciplina;
        this.horas = horas;

    }
}
