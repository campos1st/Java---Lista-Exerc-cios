package PedroHenrique;

import java.util.Scanner;

public class PHSC20 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC20 - Sequência de Fibonacci *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos termos deseja exibir? ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.println("\nFim da sequência.");
    }
}
