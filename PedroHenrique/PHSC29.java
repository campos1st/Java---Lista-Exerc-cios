package PedroHenrique;

import java.util.Scanner;

public class PHSC29 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC29 - Contar dígitos *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int num = sc.nextInt();

        int digitos = 0;

        if (num == 0) {
            digitos = 1;
        } else {
            while (num > 0) {
                num /= 10;
                digitos++;
            }
        }

        System.out.println("O número possui " + digitos + " dígitos.");
    }
}
