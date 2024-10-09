package Aula04;

public class Exercício3 {
    public static void main(String[] args) {
        int codProduto = 1;

        switch (codProduto) {
            case 1:
                System.out.println("Eletrônicos");
                break;
            case 2:
                System.out.println("Alimentos");
                break;
            case 3:
                System.out.println("Vestuários");
                break;
            default:
                System.out.println("Código inválido;");
        }

    }
}
