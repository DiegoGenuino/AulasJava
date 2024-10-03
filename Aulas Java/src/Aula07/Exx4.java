package Aula07;

import java.util.Scanner;

public class Exx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ser convertido para fahrenheit:");
        converterCelsiusParaFahrenheit(scanner.nextDouble());
    }

    public static void converterCelsiusParaFahrenheit(double numero) {
        System.out.println(numero * 1.8 + 32);
    }
}
