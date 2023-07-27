package polimorfismo;

import poo.Pessoa;

public class Professor extends Pessoa implements IPessoa {
    public String disciplina;
    public int horas;
    Professor(String nome, String sobrenome, int idade, String cpf, String disciplina, int horas) {
        super(nome, sobrenome, idade, cpf);
        this.disciplina = disciplina;
        this.horas = horas;

    }
    public String saudacao(){
        return String.format("Olá, meu nome é %s %s e sou Professor de %s!", this.nome, this.sobrenome, this.disciplina);
    }
}
