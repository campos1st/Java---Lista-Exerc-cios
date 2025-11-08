package PedroHenrique;

import java.util.Scanner;

public class PHSC19 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC19 - Verificar se um número é primo *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo)
            System.out.println(num + " é primo.");
        else
            System.out.println(num + " não é primo.");

    }
}
