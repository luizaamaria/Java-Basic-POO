package poo;

public class Pessoa  {
    public String nome;
    public String sobrenome;
    public int idade;
    private String cpf;


    protected Pessoa(String nome, String sobrenome, int idade, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String saudacao(){
        return String.format("Olá, %s %s!", this.nome, this.sobrenome);
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}
