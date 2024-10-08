package Aula08.Exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo1 {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Aluno\\Documents\\DIEGO GENUINO\\Aulas Java\\src\\arquivo.txt");
        if (arquivo.exists()) {
            System.out.println("Arquivo existe");
        } else {
            try {
                if (arquivo.createNewFile()) {
                    System.out.println(arquivo.getName() + "Arquivo criado com sucesso");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
