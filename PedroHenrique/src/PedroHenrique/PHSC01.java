package PedroHenrique;

import java.util.Scanner;

public class PHSC01 {


		    public static void main(String[] args) {
		        System.out.println("********************************");
		        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
		        System.out.println("* Classe: PHSC01 - Número positivo ou negativo *");
		        System.out.println("********************************\n");

		        Scanner sc = new Scanner(System.in);
		        System.out.print("Digite um número: ");
		        int num = sc.nextInt();

		        if (num > 0)
		            System.out.println("O número é positivo.");
		        else if (num < 0)
		            System.out.println("O número é negativo.");
		        else
		            System.out.println("O número é zero.");

		    }
		

	}


