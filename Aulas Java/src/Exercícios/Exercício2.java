package Exercícios;

public class Exercício2 {
    public static void main(String[] args) {

        int numero = 0;
        int par = 0;

        while (numero < 100) {
            numero += 2;
            par = numero + par;

        }
        System.out.println(par);
    }
}
