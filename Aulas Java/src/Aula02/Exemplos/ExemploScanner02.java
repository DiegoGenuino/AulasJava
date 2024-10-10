package Aula02.Exemplos;

import java.util.Scanner;


public class ExemploScanner02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: \n");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "!");

        scanner.close();
    }
}

