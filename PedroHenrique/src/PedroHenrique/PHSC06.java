package PedroHenrique;

import java.util.Scanner;

public class PHSC06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("********************************");
	        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
	        System.out.println("* Classe: PHSC06 - Múltiplo de 3 e/ou 5 *");
	        System.out.println("********************************\n");

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um número: ");
	        int num = sc.nextInt();

	        if (num % 3 == 0 && num % 5 == 0)
	            System.out.println("É múltiplo de 3 e 5.");
	        else if (num % 3 == 0)
	            System.out.println("É múltiplo de 3.");
	        else if (num % 5 == 0)
	            System.out.println("É múltiplo de 5.");
	        else
	            System.out.println("Não é múltiplo de 3 nem de 5.");

	}

}
