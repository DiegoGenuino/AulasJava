package Aula06;

import java.util.Scanner;

public class Exercicío5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        String msg = "";
        String[] nomes = {"Diego", "Yago", "João"};

        System.out.println("Digite um nome:");
        resposta = scanner.nextLine();
        for (int i = 0; i < nomes.length; i++) {
            if (resposta.equals(nomes[i])) {
                msg = "Tem";
                break;
            } else {
                msg = "Não tem";
            }
        }
        System.out.println(msg);
        scanner.close();
    }
}
