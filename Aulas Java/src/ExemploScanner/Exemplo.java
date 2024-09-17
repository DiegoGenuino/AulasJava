
package ExemploScanner;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        scanner.close();
    }

}
