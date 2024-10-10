package Aula05;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();


        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            boolean Primo = true;


            if (numero == 1) {
                Primo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        Primo = false;
                        break;
                    }
                }
            }


            if (Primo) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }

        scanner.close();
    }
}
