package Aula07;

import java.util.Scanner;

public class exx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele é par:");
        verificarPar(scanner.nextInt());
    }

    public static void verificarPar(int numero) {
        if (numero %2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
