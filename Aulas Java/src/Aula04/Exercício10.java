package Aula04;

public class Exercício10 {
    public static void main(String[] args) {
        float valorReais = 134f;
        int codigoMoeda = 3;
        float valorConvertido;

        switch (codigoMoeda) {
            case 1:
                valorConvertido = valorReais / 5.50f;
                System.out.printf("Valor convertido: %.2f USD", valorConvertido);
                break;

            case 2:
                valorConvertido = valorReais / 6.11f;
                System.out.printf("Valor convertido: %.2f EUR", valorConvertido);
                break;

            case 3:
                valorConvertido = valorReais / 7.23f;
                System.out.printf("Valor convertido: %.2f GBP", valorConvertido);
                break;

            default:
                System.out.printf("Código da moeda inválido.");
        }
    }
}
