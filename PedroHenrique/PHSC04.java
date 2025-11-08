package PedroHenrique;

import java.util.Scanner;

public class PHSC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC04 - Pode votar? *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18)
            System.out.println("Pode votar.");
        else
            System.out.println("Não pode votar.");

	}

}
