package PedroHenrique;

import java.util.Scanner;

public class PHSC30 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC30 - Menu até sair *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Lista Melhores Profs UNICEPLAC");
            System.out.println("2 - Mostrar data atual");
            System.out.println("3 - Exibir número aleatório");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1. Willians\n2. Resto");
                    break;
                case 2:
                    System.out.println("Aaah, hoje é um ótimo dia para programar!");
                    break;
                case 3:
                    System.out.println("Número aleatório: " + (int) (Math.random() * 100));
                    break;
                case 4:
                    System.out.println("Saindo... Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

    }
}
