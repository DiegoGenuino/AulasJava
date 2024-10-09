package Aula07;

import java.util.Scanner;

public class Exercicío7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 números para saber qual é o maior deles:");
        numeroMaior(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
    public static void numeroMaior(int n1, int n2, int n3){
        if (n1 > n2 && n1 > n3) {
            System.out.println("O número maior é o: " + n1);
        } else if(n2 > n1 && n2 > n3) {
            System.out.println("O número maior é o: " + n2);
        }
        else if(n3 > n1 && n3 > n2) {
            System.out.println("O número maior é o: " + n3);
        }


    }
}
