package PedroHenrique;

import java.util.Scanner;

public class PHSC12 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC12 - Tabuada de um número *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

    }
}
