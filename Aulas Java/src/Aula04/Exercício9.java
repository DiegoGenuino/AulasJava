package Aula04;

public class Exercício9 {
    public static void main(String[] args) {
        int horaAtual = 10;

        if (horaAtual > 5 && horaAtual < 12) {
            System.out.println("Está de manhã!");
        } else if (horaAtual > 12 && horaAtual < 18) {
            System.out.println("Está de tarde!");
        } else if (horaAtual > 18 && horaAtual < 22) {
            System.out.println("Está de noite!");
        } else {
            System.out.println("Está de madrugada!");
        }
    }
}
