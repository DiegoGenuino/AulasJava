package Aula06;

import java.util.Scanner;

public class Exercicío8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas, colunas;
        double somalinhaUm = 0;
        double somalinhaDois = 0;

        System.out.println("Digite a quantidade de linhas:");
        linhas = scanner.nextInt();

        System.out.println("Digite a quantidade de colunas:");
        colunas = scanner.nextInt();

        double[][] matriz = new double[linhas][colunas];
        System.out.println("Digite números para preencher a matriz:");


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == 0) {
                    somalinhaUm += matriz[i][j];
                } else if (i == 1) {
                    somalinhaDois += matriz[i][j];
                }
            }
        }

        System.out.println("A soma dos números da linha 1 é: " + somalinhaUm);
        if (linhas > 1) {
            System.out.println("A soma dos números da linha 2 é: " + somalinhaDois);
        }
    }
}
