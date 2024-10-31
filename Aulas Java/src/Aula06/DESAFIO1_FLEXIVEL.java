package Aula06;

import java.util.Scanner;

public class DESAFIO1_FLEXIVEL {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String[] titulos = {"ID", "Nome", "Email", "Telefone"};
        int resposta;
        System.out.println("Quantas pessoas você quer cadastrar?");
        resposta = teclado.nextInt() + 1;
        teclado.nextLine();
        String[][] cadastro = new String[resposta][titulos.length];
        cadastro[0] = titulos;
        for (int i = 1; i < cadastro.length; i++) {
            cadastro[i][0] = Integer.toString(i);
            for (int j = 1; j < cadastro[i].length; j++) {
                System.out.print(titulos[j] + ": ");
                cadastro[i][j] = teclado.nextLine();
            }
            System.out.println("+++++++++++++++++++++++++++++++++");
        }
        teclado.close();
        for (String[] linha : cadastro) {
            for (String item : linha) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}
