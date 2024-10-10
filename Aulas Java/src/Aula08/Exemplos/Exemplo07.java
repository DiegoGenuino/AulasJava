package Aula08.Exemplos;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

public class Exemplo07 {
    public static void main(String[] args) {


        File arquivo = new File("C:\\Users\\Aluno\\Documents\\DIEGO GENUINO\\Aulas Java\\src\\diego.txt");

        if (arquivo.exists()) {
            try {
                BufferedReader bufferedWriter = new BufferedReader(new FileReader(arquivo));
                String linha;

                while ((linha = bufferedWriter.readLine()) != null) {
                    System.out.println(linha);

                }

            } catch (Exception e) {
                throw new RuntimeException(e);

            }


        }
    }
}











