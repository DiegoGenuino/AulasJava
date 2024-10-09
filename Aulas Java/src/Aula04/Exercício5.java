package Aula04;

public class Exercício5 {
    public static void main(String[] args) {
        int horasTrabalhadas = 48;
        int horasNormais = 40;
        double horasExtras;
        int valorPorHora = 5;
        double valorTotalHoraExtra;

        if (horasTrabalhadas > 40) {
            horasExtras = horasTrabalhadas - horasNormais;
            valorTotalHoraExtra = horasExtras * valorPorHora;
            System.out.println("Horas extras trabalhadas: " + horasExtras);
            System.out.println("O valor a ser pago pelas horas extras é: R$" + valorTotalHoraExtra);
        } else {
            System.out.println("Você não fez horas extras.");
        }
    }
}
