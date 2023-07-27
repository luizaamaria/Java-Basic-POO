package polimorfismo;

import poo.Pessoa;

public class Aluno extends Pessoa {

    public String serie;
    public String turma;
    Aluno(String nome, String sobrenome, int idade, String cpf, String serie, String turma){
        super(nome, sobrenome, idade, cpf);
        this.serie = serie;
        this.turma = turma;
    }
    public String saudacao(){
        return String.format("Olá, meu nome é %s %s e sou aluno do %s %s!", this.nome, this.sobrenome, this.serie, this.turma);
    }
}
