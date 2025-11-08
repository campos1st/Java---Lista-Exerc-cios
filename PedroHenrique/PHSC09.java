package PedroHenrique;

import java.util.Scanner;

public class PHSC09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("********************************");
	        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
	        System.out.println("* Classe: PHSC09 - Ordem crescente *");
	        System.out.println("********************************\n");

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o primeiro número: ");
	        int a = sc.nextInt();
	        System.out.print("Digite o segundo número: ");
	        int b = sc.nextInt();
	        System.out.print("Digite o terceiro número: ");
	        int c = sc.nextInt();

	        // ordenação simples usando if
	        if (a > b) { int temp = a; a = b; b = temp; }
	        if (a > c) { int temp = a; a = c; c = temp; }
	        if (b > c) { int temp = b; b = c; c = temp; }

	        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);

	}

}
