package PedroHenrique;

import java.util.Scanner;

public class PHSC07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("********************************");
	        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
	        System.out.println("* Classe: PHSC07 - Triângulo válido *");
	        System.out.println("********************************\n");

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Lado A: ");
	        int a = sc.nextInt();
	        System.out.print("Lado B: ");
	        int b = sc.nextInt();
	        System.out.print("Lado C: ");
	        int c = sc.nextInt();

	        if (a + b > c && a + c > b && b + c > a)
	            System.out.println("Forma um triângulo válido.");
	        else
	            System.out.println("Não forma um triângulo.");

	}

}
