package Exemplos;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {

        int fatorial, numeroDigi;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número positivo para calcular seu fatorial: ");
        numeroDigi = scanner.nextInt();
fatorial =  numeroDigi;


        for (int contador = 1; contador < numeroDigi; contador++) {
            fatorial*=contador;

        }
        System.out.println("O fatorial de " + numeroDigi + "é "
        + fatorial);
    }
    }

