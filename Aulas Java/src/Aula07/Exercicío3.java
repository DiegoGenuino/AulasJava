package Aula07;

import java.util.Scanner;

public class Exercicío3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ser sobrado:");
        dobrar(scanner.nextInt());
    }

    public static void dobrar(int numero) {
        System.out.println(numero *2);
    }
}
