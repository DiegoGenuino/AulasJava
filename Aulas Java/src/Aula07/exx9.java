package Aula07;

import java.util.Scanner;

public class exx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base e em seguida o expoente:");
        calcularPotencia(scanner.nextInt(), scanner.nextInt());
    }

    public static void calcularPotencia(int n1, int n2) {
            int resultado = 1;
            for (int i = 0; i < n2; i++) {
                resultado *= n1;
            }
        System.out.println(resultado);
    }
}
