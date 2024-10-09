package Aula07;

import java.util.Scanner;

public class Exercicío2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números para somar:");

        somar(scanner.nextInt(), scanner.nextInt());
    }

    public static void somar(int numero1, int numero2) {

        System.out.println(numero1 + numero2);
    }
}
