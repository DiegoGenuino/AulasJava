package Aula02.Exemplos;

import java.util.Scanner;

public class ExemploScanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: \n");
        int numero = scanner.nextInt();

        System.out.println("Você digitou o número: " + numero);

        scanner.close();
    }
}
