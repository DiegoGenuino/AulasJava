package Aula05;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();


        if (numero < 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {

            long fatorial = 1;
            int contador = 1;

            do {
                fatorial *= contador;
                contador++;
            } while (contador <= numero);


            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        scanner.close();
    }
}
