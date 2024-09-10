package Aula04;

public class Exemplo1_1 {
    public static void main(String[] args) {

        String corSema = "AMAReLO";

        if (corSema.equalsIgnoreCase("verde")) {
            System.out.println("Avance");

        } else if (corSema.equalsIgnoreCase("amarelo")) {
            System.out.println("Atenção");
        } else if (corSema.equalsIgnoreCase("vermelho")) {
            System.out.println("Pare");
        } else {
            System.out.println("Cor invalida");
        }
    }
}

