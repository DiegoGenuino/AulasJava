package Aula04;

public class Exercício6 {
    public static void main(String[] args) {
        int notaAluno = 7;

        if (notaAluno >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (notaAluno > 5 && notaAluno < 7) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno aprovado");
        }
    }
}
