package Exercícios;

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int notas = 0, media;
        for (int i = 1; i < 6; i++) {
            System.out.println("Digite a " + i + "ª nota");
            notas += scanner.nextInt();

        }
        media = notas / 5;
        System.out.println("Sua média é " + media);
        scanner.close();
    }
}
