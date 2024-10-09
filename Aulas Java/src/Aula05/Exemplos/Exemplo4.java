package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        String nome = "Rafael,", nomeDigitado;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("digite seu nome:");
            nomeDigitado = scanner.nextLine();

        } while (!nome.equals(nomeDigitado));
        System.out.println("Parabéns, esse é seu nome!");
        scanner.close();
    }
}
