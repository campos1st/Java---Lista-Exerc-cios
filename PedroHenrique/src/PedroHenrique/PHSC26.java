package PedroHenrique;

import java.util.Scanner;

public class PHSC26 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC26 - Número primo com while *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            int i = 2;
            while (i <= num / 2) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
                i++;
            }
        }

        if (primo)
            System.out.println(num + " é primo.");
        else
            System.out.println(num + " não é primo.");

    }
}
