package Aula07.Exemplos;

public class Exemplo02 {
    public static void main(String[] args) {

        funcaoComParametroSemRetorno(10, "Diego");

    }

    static void funcaoComParametroSemRetorno(int parametro1, String parametro2) {
        System.out.println("parametro1 = " + parametro1);
        System.out.println("parametro2 = " + parametro2);
    }
}
