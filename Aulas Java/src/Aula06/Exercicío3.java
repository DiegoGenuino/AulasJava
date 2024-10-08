package Aula06;

import java.util.Scanner;

public class Exercicío3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeTrues = 0;
        Boolean[] booleanos = new Boolean[8];


        for (int i = 0 ; i < booleanos.length; i++) {
            System.out.println("Digite o " + i + "° valor booleano");
            booleanos[i] = scanner.nextBoolean();

        }

        for (int i = 0; i < booleanos.length; i++) {
            if (booleanos[i].equals(true)) {
                quantidadeTrues++;
            }
        }
        System.out.println("Existem " + quantidadeTrues + " Trues");
        scanner.close();
    }
}
