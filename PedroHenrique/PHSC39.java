package PedroHenrique;

import java.util.Scanner;

public class PHSC39 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC39 - Validar número entre 1 e 5 *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
        } while (num < 1 || num > 5);

        System.out.println("Número válido digitado: " + num);
    }
}
