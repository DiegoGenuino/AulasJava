package Aula08;

public class Exercício1 {
    public static void main(String[] args) {
        String linha = " Diego; Arthur; Gustavo; Guilherme; João";
        String[] tokens = linha.split(";");
        for (String token: tokens) {
            System.out.println(token);
        }
    }
}
