package Aula08.Exemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo05 {
    public static void main(String[] args) {


        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\Aluno\\Documents\\DIEGO GENUINO\\Aulas Java\\src\\diego.txt");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Diego Genuino de Oliveira");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}











