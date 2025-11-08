package PedroHenrique;

import java.util.Scanner;

public class PHSC05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("********************************");
	        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
	        System.out.println("* Classe: PHSC05 - Notas e aprovação *");
	        System.out.println("********************************\n");

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite a nota 1: ");
	        double n1 = sc.nextDouble();
	        System.out.print("Digite a nota 2: ");
	        double n2 = sc.nextDouble();

	        double media = (n1 + n2) / 2;

	        if (media >= 6)
	            System.out.println("Aprovado! Média: " + media);
	        else
	            System.out.println("Reprovado. Média: " + media);

	}

}
