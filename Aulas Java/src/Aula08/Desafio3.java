package Aula08;

import java.io.*;
import java.util.Scanner;

public class Desafio3 {
    static String[][] matrizCadastro = {null};
    static Scanner scanner = new Scanner(System.in);
    //forma mais facil de preencher uma linha da matriz
    static String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
    static File bancoDeDados = new File("src\\Aula08\\desafios\\Banco de dados.txt");

    public static void main(String[] args) {
        carregarDadosDoArquivo();
        //quantidade de usuarios com o cabeçalho adicionado (+1)
        matrizCadastro[0] = cabecalho;
        int opcao;
        do {
            System.out.println("escolha uma opção: ");
            System.out.println("\t-1 Para exibir os usuários cadastrados ");
            System.out.println("\t-2 Para cadastrar um usuário ");
            System.out.println("\t-3 Para atualizar um usuário ");
            System.out.println("\t-4 Para deletar um usuário ");
            System.out.println("\t-5 Para sair do programa ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    exibirCadastro();
                    break;
                case 2:
                    cadastrarUsuario();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("Fim do programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("opção inválida");
            }
        } while (opcao != 5);

    }


    private static void cadastrarUsuario() {
        System.out.print("Digite a quantidade de usuários que deseja cadastrar: ");
        int qtdUsuarios = scanner.nextInt();

        scanner.nextLine();


        String[][] novaMatriz = new String[matrizCadastro.length + qtdUsuarios][matrizCadastro[0].length];
        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                novaMatriz[linhas][colunas] = matrizCadastro[linhas][colunas];
            }
        }

        System.out.println("Preencha os dados a seguir: ");
        for (int linhas = matrizCadastro.length; linhas < novaMatriz.length; linhas++) {

            novaMatriz[linhas][0] = String.valueOf(linhas);
            System.out.println(matrizCadastro[0][0] + "-" + linhas);

            for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {
                System.out.print(matrizCadastro[0][colunas] + ": ");
                novaMatriz[linhas][colunas] = scanner.nextLine();
            }
        }
        matrizCadastro = novaMatriz;
        salvarDadosNoArquivo();
    }

    private static void exibirCadastro() {
        String tabela = "";

        for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {

            for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                tabela += matrizCadastro[linhas][colunas];

                tabela += colunas == 0 ? "\t" : "\t\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }


    private static void atualizarUsuario() {
        exibirCadastro();
        System.out.print("Digite o ID do usuário que deseja atualizar:");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Atualiza as informações a seguir:");
        System.out.println(matrizCadastro[0][0] + "-" + idUsuario);
        //quantidade de colunas
        for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {
            System.out.print(matrizCadastro[0][colunas] + ": ");
            //a linha do usuario a partir o id
            matrizCadastro[idUsuario][colunas] = scanner.nextLine();
        }
        System.out.println("Usuário atualizado com sucesso!!");
        exibirCadastro();
        salvarDadosNoArquivo();
    }

    private static void deletarUsuario() {
        exibirCadastro();
        System.out.print("Digite o ID do usuário que deseja deletar:");
        int idUsuario = scanner.nextInt();
        scanner.nextLine();
        //nova martriz com menos um usuario deletado
        String[][] novaMatriz = new String[matrizCadastro.length - 1][matrizCadastro[0].length];
        novaMatriz[0] = cabecalho;
        //linhamatrizcadastro faz a varredura de linha por linha
        for (int linhaMatrizCadastro = 1, linhaNovaM = 1; linhaMatrizCadastro < matrizCadastro.length; linhaMatrizCadastro++) {
            if (idUsuario == linhaMatrizCadastro) continue;
            novaMatriz[linhaNovaM] = matrizCadastro[linhaMatrizCadastro];
            novaMatriz[linhaNovaM][0] = String.valueOf(linhaNovaM);
            linhaNovaM++;
        }
        matrizCadastro = novaMatriz;
        exibirCadastro();
        salvarDadosNoArquivo();
    }

    private static void salvarDadosNoArquivo() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bancoDeDados))) {
            //copia cada linha da matriz cadastro e coloca na nova matriz unidimensional
            for (String[] linhaMatriz : matrizCadastro) {
                // um delimitador para juntar a matriz ;
                String texto;
                bufferedWriter.write(String.join(",", linhaMatriz) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void carregarDadosDoArquivo() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(bancoDeDados))) {

            if (!bancoDeDados.exists()) return;
            String linha = "";
            String dados = "";

            while ((linha = bufferedReader.readLine()) != null) {
                dados += linha + "\n";
            }

            String[] linhaUsuario = dados.split("\n");
            //encadeamento de chamados , quebrando as linhas através da "," formando uma matriz e medindo a matriz com o "length" tamanho.
            int qtdColunas = linhaUsuario[0].split(",").length;
            matrizCadastro = new String[linhaUsuario.length][qtdColunas];
            // fazendo a quebra de linhas atribuindo numa matriz
            for (int linhas = 0; linhas < linhaUsuario.length; linhas++) {
                matrizCadastro[linhas] = linhaUsuario[linhas].split(",");
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
