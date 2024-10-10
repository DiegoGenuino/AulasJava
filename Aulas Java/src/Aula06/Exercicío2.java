package Aula06;

import java.util.Scanner;

public class Exercicío2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        String[] caracteres = new String[6];

        caracteres[0] = "a";
        caracteres[1] = "b";
        caracteres[2] = "c";
        caracteres[3] = "d";
        caracteres[4] = "e";
        caracteres[5] = "f";

        System.out.println("Digite uma letra:");
        resposta = scanner.nextLine();
        for (int i = 0; i < caracteres.length; i++) {
            if (resposta.equals(caracteres[i])) {
                System.out.println("Esta letra está presente no Vetor na posição " + i);

            }
        }

        scanner.close();
    }
}