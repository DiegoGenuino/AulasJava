package Aula08.Exemplos;

import java.util.Arrays;

public class Exemplo08 {
    public static void main(String[] args) {
        String linha = "ID:1;NOME:DIEGO;IDADE:16";

        String[] tokens = linha.split(";");
        for (String token: tokens){
            System.out.println(token);
        }

        String valores = "";

        for (int i = 0; i < tokens.length; i++) {
            String[]  chaveValor = tokens[i].split(":");
           valores += i == (tokens.length - 1)? chaveValor[1] : chaveValor[1] + ", ";

        }
        System.out.println(valores);

        String[] idade = tokens[2].split(":");

        int valorIdade = Integer.parseInt(idade[1].trim()) + 1;

        System.out.println("A idade será " + valorIdade);





    }
}
