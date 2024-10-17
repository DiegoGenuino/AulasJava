package Aula07.Exemplos;

public class Exemplo03 {
    public static void main(String[] args) {

        int soma = funcaoComParametroComRetorno(5, 5);
        System.out.println(soma);

    }

    static int funcaoComParametroComRetorno(int parametro1, int parametro2) {
        return parametro1 + parametro2;
    }
}
