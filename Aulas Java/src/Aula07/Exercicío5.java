package Aula07;

import java.util.Scanner;

public class Exercicío5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três notas para obter a média:");
        calcularMedia(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
    public static void calcularMedia(int nota1, int nota2, int nota3){
        System.out.println((nota1 + nota2 + nota3) / 3);
    }
}
