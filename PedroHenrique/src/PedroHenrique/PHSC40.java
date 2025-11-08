package PedroHenrique;

import java.util.Scanner;

public class PHSC40 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC40 - Maior número até digitar negativo *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;

        do {
            System.out.print("Digite um número (negativo para sair): ");
            num = sc.nextInt();
            if (num >= 0 && num > maior)
                maior = num;
        } while (num >= 0);

        if (maior != Integer.MIN_VALUE)
            System.out.println("O maior número digitado foi: " + maior);
        else
            System.out.println("Nenhum número positivo foi digitado.");

    }
}
