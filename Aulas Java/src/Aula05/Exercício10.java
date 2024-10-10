package Aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        while (true) {
            System.out.print("Digite um número inteiro (ou um número negativo para sair): ");
            int numero = scanner.nextInt();


            if (numero < 0) {
                break;
            }


            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada.");
                break;
            }


            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }


            System.out.println("Números pares digitados: " + pares);
            System.out.println("Números ímpares digitados: " + impares);

            scanner.close();
        }
    }
}



