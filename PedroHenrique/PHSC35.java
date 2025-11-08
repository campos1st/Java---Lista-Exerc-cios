package PedroHenrique;

import java.util.Scanner;

public class PHSC35 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC35 - Número positivo obrigatório *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um número positivo: ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println("Número válido digitado: " + num);
    }
}
