package Aula04.Exemplos;

public class Exemplo1 {
    public static void main(String[] args) {

        String corSema = "amarelo";

        if (corSema.equalsIgnoreCase("verde")) {
            System.out.println("Avance");

        } else if (corSema.equalsIgnoreCase("amarelo")) {
            System.out.println("Atenção");
        } else if (corSema.equalsIgnoreCase("vermelho")) {
            System.out.println("Pare");
        } else {
            System.out.println("Cor inválida");
        }

        switch (corSema) {
            case "verde":
                System.out.println("===============Avance===============");

            case "amarelo":
                System.out.println("===============Atenção===============");

            case "vermelho":
                System.out.println("===============Pare===============");

            default:
                System.out.println("===============Cor inválida===============");
        }
    }
}
