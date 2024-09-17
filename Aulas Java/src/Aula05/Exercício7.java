package Aula05;

public class Exercício7 {
    public static void main(String[] args) {
        int n1 = 32;
        int n2 = 12;
        String operacaoEscolhida = "+";

        switch (operacaoEscolhida) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }
}
