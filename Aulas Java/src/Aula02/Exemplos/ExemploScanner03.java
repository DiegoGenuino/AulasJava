package Aula02.Exemplos;

import java.util.Scanner;

public class ExemploScanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();


        System.out.print("Digite o seu peso em kgs: ");
        double peso = scanner.nextDouble();


        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Seu nome é " + nome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Você pesa " + peso + " kgs");
        System.out.println("Você tem " + altura + " m de altura");

        scanner.close();
    }
}
