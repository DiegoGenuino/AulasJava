package Aula08.Exercícios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter buffer = new BufferedWriter(new FileWriter("alunos.txt", true))) {

            for (int i = 0; i < 5; i++) {
                System.out.println("Digite o " + (i + 1) + "° nome: ");
                String nome = scanner.nextLine();
                buffer.write(nome);
                buffer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

