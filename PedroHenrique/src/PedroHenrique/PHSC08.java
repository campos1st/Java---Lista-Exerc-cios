package PedroHenrique;

import java.util.Scanner;

public class PHSC08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("********************************");
	        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
	        System.out.println("* Classe: PHSC08 - Login simples *");
	        System.out.println("********************************\n");

	        Scanner sc = new Scanner(System.in);
	        String usuarioCorreto = "Arnaldo";
	        String senhaCorreta = "2323";

	        System.out.print("Usuário: ");
	        String user = sc.nextLine();
	        System.out.print("Senha: ");
	        String senha = sc.nextLine();

	        if (user.equals(usuarioCorreto) && senha.equals(senhaCorreta))
	            System.out.println("Login bem-sucedido!");
	        else
	            System.out.println("Usuário ou senha incorretos.");

	}

}
