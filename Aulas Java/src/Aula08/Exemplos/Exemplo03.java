package Aula08.Exemplos;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo03 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\Documents\\DIEGO GENUINO\\Aulas Java\\src\\diego.txt", true);
            //Modúlo append habilitado.
            fileWriter.write("Texto a ser gravado no arquivo");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
