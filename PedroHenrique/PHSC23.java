package PedroHenrique;

import java.util.Scanner;

public class PHSC23 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC23 - Senha correta *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "2808";
        String senhaDigitada = "";

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta, tente novamente!");
            }
        }

        System.out.println("Acesso permitido!");
    }
}
