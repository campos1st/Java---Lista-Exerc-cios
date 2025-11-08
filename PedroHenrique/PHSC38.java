package PedroHenrique;

import java.util.Scanner;

public class PHSC38 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC38 - Confirmar saída com 's' *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        char resposta;

        do {
            System.out.println("Você deseja sair do programa? (s/n)");
            resposta = sc.next().toLowerCase().charAt(0);
        } while (resposta != 's');

        System.out.println("Saindo do programa... Até logo!");
    }
}
