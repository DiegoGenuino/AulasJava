package Aula07;

import java.util.Scanner;

public class exx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso e em seguida a sua altura:");
        calcularImc(scanner.nextDouble(), scanner.nextDouble());
    }

    public static void calcularImc(double peso, double altura) {
        double imc = peso / (altura * altura);
        System.out.println(String.format("%.2f", imc));
    }
}
