package PedroHenrique;

import java.util.Scanner;

public class PHSC03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("********************************");
	        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
	        System.out.println("* Classe: PHSC03 - Maior de dois números *");
	        System.out.println("********************************\n");

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o primeiro número: ");
	        int a = sc.nextInt();
	        System.out.print("Digite o segundo número: ");
	        int b = sc.nextInt();

	        if (a > b)
	            System.out.println("O maior é: " + a);
	        else if (b > a)
	            System.out.println("O maior é: " + b);
	        else
	            System.out.println("Os números são iguais.");

	}

}
