package Aula05;

import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        do {
            System.out.println("Digite uma nota entre 0 e 10");
            nota = scanner.nextInt();
        } while (nota > 10) ;{
            System.out.println("Digite a nota novamente");
        }



    }
}
