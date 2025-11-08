package PedroHenrique;

import java.util.Scanner;

public class PHSC10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("********************************");
	        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
	        System.out.println("* Classe: PHSC10 - Ano bissexto *");
	        System.out.println("********************************\n");

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um ano: ");
	        int ano = sc.nextInt();

	        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
	            System.out.println("Ano bissexto.");
	        else
	            System.out.println("Não é ano bissexto.");


	}

}
