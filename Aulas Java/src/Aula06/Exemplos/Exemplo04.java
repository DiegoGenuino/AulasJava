package Aula06.Exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta = "matriz{\n";
        int matriz[][] = new int[2][2];

        for (int linha = 0; linha < matriz.length; linha++) {
            resposta += "\t{";
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("Digite o valor da posição [" + linha + ", " + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
                resposta += matriz[linha][coluna];
                resposta += coluna < (matriz[linha].length - 1) ? "," : "}";
            }
            resposta += linha < (matriz[linha].length - 1) ? ",\n" : "\n}";
        }
        System.out.println(resposta);

        scanner.close();
    }
}

