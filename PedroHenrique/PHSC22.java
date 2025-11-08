package PedroHenrique;

import java.util.Scanner;

public class PHSC22 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC22 - Soma até digitar zero *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int num;

        do {
            System.out.print("Digite um número (0 para sair): ");
            num = sc.nextInt();
            soma += num;
        } while (num != 0);

        System.out.println("A soma total é: " + soma);
    }
}
