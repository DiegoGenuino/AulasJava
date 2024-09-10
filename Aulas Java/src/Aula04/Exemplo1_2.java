package Aula04;

public class Exemplo1_2 {
    public static void main(String[] args) {
        int idade = 18;

        if (idade >= 0 && idade <= 12) {
            System.out.println("criança");
        } else if (idade >= 13 && idade <= 18) {
            System.out.println("Adolescente");
        } else if (idade >= 19 && idade <= 64) {
            System.out.println("Adulto");
        } else if (idade > 65) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade incompátivel");
        }


    }
}
