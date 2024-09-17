package Aula05;

public class Exercício10 {
    public static void main(String[] args) {
        float valorReais = 134f;
        int codigoMoeda = 1;
        float valorConvertido;

        switch (codigoMoeda) {
            case 1:
                valorConvertido = valorReais * 5.50f;
                System.out.println("Valor convertido: " + valorConvertido + " Dólares");
                break;

            case 2:
                valorConvertido = valorReais * 6.11f;
                System.out.println("Valor convertido: " + valorConvertido + " Euros");
                break;

            case 3:
                valorConvertido = valorReais * 7.23f;
                System.out.println("Valor convertido: " + valorConvertido + " Libras");
                break;

            default:
                System.out.println("Código da moeda inválido.");
        }
    }
}
