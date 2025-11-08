package PedroHenrique;

import java.util.Scanner;

public class PHSC27 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC27 - Quantidade de números ímpares *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        int i = 1;
        int impares = 0;

        while (i <= 10) {
            System.out.print("Digite o " + i + "º número: ");
            int num = sc.nextInt();
            if (num % 2 != 0) {
                impares++;
            }
            i++;
        }

        System.out.println("Foram digitados " + impares + " números ímpares.");
    }
}
