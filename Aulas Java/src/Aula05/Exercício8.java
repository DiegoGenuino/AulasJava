package Aula05;

import java.util.Scanner;

public class Exercício8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePares = 0;
        int quantidadeImpares = 0;


        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();


            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }


        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

        scanner.close();
    }
}



