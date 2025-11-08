package PedroHenrique;

import java.util.Scanner;

public class PHSC32 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC32 - Tabuada de um número (do...while) *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int num = sc.nextInt();

        int i = 1;
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);

    }
}
