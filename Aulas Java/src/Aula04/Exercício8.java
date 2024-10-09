package Aula04;

public class Exercício8 {
    public static void main(String[] args) {
        int desempenhoFuncionario = 5;

        switch (desempenhoFuncionario) {
            case 1:
                System.out.println("Precisa melhorar.");
                break;
            case 2:
                System.out.println("Abaixo da média.");
                break;
            case 3:
                System.out.println("Média.");
                break;
            case 4:
                System.out.println("Acíma da média.");
                break;
            case 5:
                System.out.println("Excelente.");
                break;
            default:
                System.out.println("Número não dísponivel na escala.");
        }
    }

}
