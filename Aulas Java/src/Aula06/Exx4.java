package Aula06;

import java.util.Scanner;

public class Exx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double somaNotas = 0;
        double media = 0;
        for (int i = 0; i < 4; i++) {

            System.out.println("Digite a " + (i+1) + "° nota");

            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
            media = somaNotas / notas.length;
        }
        System.out.println("A média das notas é: " + media);
    }
}
