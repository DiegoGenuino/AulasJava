package Aula08.Exercícios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercício2 {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("alunos.txt"));
            String linha;
            while((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
