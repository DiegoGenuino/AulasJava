package Aula05;

public class Exercício4 {
    public static void main(String[] args) {
        int valorVendas = 5000;
        double comissao1 = 0.05;
        double comissao2 = 0.10;
        double comissao3 = 0.15;
        double valorComissao;

        if (valorVendas < 1000) {
            valorComissao = valorVendas * comissao1;

        } else if (valorVendas >= 1000 && valorVendas <= 4999) {
            valorComissao = valorVendas * comissao2;

        } else {
            valorComissao = valorVendas * comissao3;

        }
        System.out.println("O valor da sua comissão: " + valorComissao);
    }

}
