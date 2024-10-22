package Aula06;

import java.util.Scanner;

public class DESAFIO1_FLEXIVEL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de usuários que deseja cadastrar:");
        int qtdUsuarios = scanner.nextInt();
        scanner.nextLine();

        String[] cabecalho = {"ID", "NOME", "TELEFONE", "EMAIL"};

        String[][] matrizCadastro = new String[qtdUsuarios + 1][cabecalho.length];
        matrizCadastro[0] = cabecalho;

        System.out.println("Preencha os dados a seguir: ");
        for (int linhas = 1; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                System.out.println(cabecalho[colunas] + ": ");
                matrizCadastro[linhas][colunas] = scanner.nextLine();
            }

        }

        String tabela = "";


        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];

                tabela += colunas == 0 ? "\t" : "\t \t \t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }
}
