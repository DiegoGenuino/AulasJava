package Aula06.Exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Determine o tamanhodo vetor: ");
                int[] vetor = new int[scanner.nextInt()];
                String exibirValor = "vetor{";

                for (int posicao = 0; posicao < vetor.length; posicao++) {
                    System.out.print("Digite o " + (posicao + 1) + "º número: ");
                    vetor[posicao] = scanner.nextInt();
                    exibirValor += vetor[posicao];
                    exibirValor += posicao < vetor.length - 1 ? ", " : "}";
                }
                System.out.println(exibirValor);

                scanner.close();
            }
    }

