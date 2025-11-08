package PedroHenrique;

import java.util.Scanner;

public class PHSC34 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC34 - Pedir senha até acertar *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        } while (senha != 6767);

        System.out.println("Acesso liberado!");
    }
}
