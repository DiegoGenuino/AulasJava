package Aula07;

import java.util.Scanner;

public class exx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite inteiro positivo:");
        calcularFatorial(scanner.nextInt(), 1);
    }

    public static void calcularFatorial(int numero, int fatorial) {
        if (numero == 0) {
            System.out.println("O fatorial de 0 é 1");
        } else {
            for (int contador = numero; contador != 1; contador--) {
                numero = numero * fatorial;
                fatorial++;
            }
            System.out.println("O fatorial é: ");
            System.out.println(numero);
        }
    }
}
