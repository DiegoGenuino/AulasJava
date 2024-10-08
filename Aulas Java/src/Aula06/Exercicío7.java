package Aula06;

import java.util.Scanner;

public class Exercicío7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int[][] matriz = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
        System.out.println("Digite números inteiros para preencher a matriz: \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("O valor total da matriz é: " + soma);
    }
}
