package Aula08.Exemplos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo04 {
    public static void main(String[] args) {
        try {
            File arquivo = new File("C:\\Users\\Aluno\\Documents\\DIEGO GENUINO\\Aulas Java\\src\\diego.txt");
            if (arquivo.exists()) {
                FileReader fileReader = new FileReader(arquivo);

                int caracter;
                while ((caracter = fileReader.read()) != -1) {
                    System.out.print((char) caracter);
                }
            } else {
                arquivo.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}