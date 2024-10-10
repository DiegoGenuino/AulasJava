package Aula08.Exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo06 {
    public static void main(String[] args) {


        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\Aluno\\Documents\\DIEGO GENUINO\\Aulas Java\\src\\diego.txt", true);
            //Modúlo append habilitado
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Texto escrito com o modulo append habilitado.");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}











