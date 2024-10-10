package Aula02.Exemplos;

import java.util.Scanner;

public class ExemploScanner04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int numeroUm = scanner.nextInt();
        System.out.println("O número é: ");


        System.out.println("Digite um nome: ");
        String nomeUm = scanner.nextLine();
        System.out.println("O nome é: ");


        System.out.println("Digite um número: ");
        int numeroDois = scanner.nextInt();
        scanner.nextLine();
        System.out.println("O número é: ");


        System.out.println("Digite um nome: ");
        String nomeDois = scanner.nextLine();
        System.out.println("O nome é: " + nomeDois);

        scanner.close();
    }
}
