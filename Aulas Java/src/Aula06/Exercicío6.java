package Aula06;


import java.util.Scanner;

public class Exercicío6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = {
                {0, 0},
                {0, 0},
        };
        System.out.println("Digite números inteiros para preencher a matriz: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz preenchida! \n");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
