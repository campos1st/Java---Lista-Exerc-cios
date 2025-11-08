package PedroHenrique;

import java.util.Scanner;

public class PHSC37 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC37 - Soma até múltiplo de 10 *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        int num;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            soma += num;
        } while (num % 10 != 0);

        System.out.println("Soma total: " + soma);
    }
}
