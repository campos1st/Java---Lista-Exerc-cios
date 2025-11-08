package PedroHenrique;

import java.util.Scanner;

public class PHSC02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC02 - Par ou ímpar *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("O número é par!");
        else
            System.out.println("O número é ímpar!");

	}

}
