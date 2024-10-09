package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int par = 0, impar = 0, numero;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "ª número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

        }
        System.out.println("Existem " + par + " números pares e " + impar + " números impares");
        scanner.close();
    }
}
