package Aula05;

public class Exercício2 {
    public static void main(String[] args) {
        int compra1 = 235;
        int compra2 = 123;
        double desconto = 0.1;

        double valorTotal = compra1 + compra2;

        if (valorTotal > 100) {
            valorTotal = valorTotal - valorTotal * desconto;
            System.out.println("Desconto aplicado de 10%");
        } else {
            System.out.println("Sem desconto a ser aplicado");
        }
        System.out.println("valor final a ser pago: " + valorTotal);
    }
}
