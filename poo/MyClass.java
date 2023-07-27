package poo;

public class MyClass {
    public static void main(String[] args) {

        Aluno manuel = new Aluno("Manuel", "Silva", 23, "123456789-00", "3°", "A");
        Professor maria = new Professor("Maria", "Silva", 23, "123456789-00", "Português", 40);

        System.out.println(manuel.saudacao());
        System.out.println(manuel.serie);
        System.out.println(manuel.turma);
        System.out.println(maria.saudacao());
        System.out.println(maria.disciplina);
        System.out.println(maria.horas);
    }
}
