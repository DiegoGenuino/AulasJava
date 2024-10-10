package Aula05;

import java.util.Random;
import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Adivinhe o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número!");
            }
        } while (palpite != numeroAleatorio);


        System.out.println("Número de tentativas: " + tentativas);

        scanner.close();
    }
}
