package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        String nome = "Rafael", nomeDigitado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nomeDigitado = scanner.nextLine();

        while (!nome.equals(nomeDigitado)) {
            System.out.println("Nome errado, digite novamente:");
            nomeDigitado = scanner.nextLine();
        }
        System.out.println("Parabéns esse é o seu nome.");
        scanner.close();
    }
}
