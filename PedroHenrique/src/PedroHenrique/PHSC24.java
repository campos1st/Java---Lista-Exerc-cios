package PedroHenrique;

import java.util.Scanner;

public class PHSC24 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC24 - Número positivo *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um número positivo: ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("Número positivo digitado: " + num);
    }
}
