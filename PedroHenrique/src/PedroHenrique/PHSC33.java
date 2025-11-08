package PedroHenrique;

import java.util.Scanner;

public class PHSC33 {

    // Método pra limpar a tela
    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar a tela.");
        }
    }

    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC33 - Menu da Lanchonete do Pedro *");
        System.out.println("********************************\n");

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n🍔=== LANCHONETE DO PEDRO ===🍟");
            System.out.println("1 - Ver cardápio");
            System.out.println("2 - Fazer um pedido");
            System.out.println("3 - Ver mensagem secreta 😏");
            System.out.println("4 - Sair");
            System.out.println("==============================");
            System.out.print("👉 Escolha uma opção: ");
            opcao = sc.nextInt();

            limparTela(); // limpa a tela após escolher

            switch (opcao) {
                case 1:
                    System.out.println("\n📋 CARDÁPIO:");
                    System.out.println("🍔 X-Burger ........ R$ 12,00");
                    System.out.println("🥬 X-Salada ........ R$ 14,00");
                    System.out.println("🥓 X-Bacon ......... R$ 16,00");
                    System.out.println("🍟 Batata Frita .... R$ 8,00");
                    System.out.println("🥤 Refrigerante .... R$ 6,00");
                    break;

                case 2:
                    System.out.println("\n🍴 Pedido realizado com sucesso!");
                    System.out.println("😋 Seu lanche estará pronto em alguns minutos!");
                    break;

                case 3:
                    System.out.println("\n💬 Mensagem secreta: “Comer bem é a chave da felicidade!” 😄");
                    break;

                case 4:
                    System.out.println("\n🧾 Finalizando o sistema... Obrigado por visitar a Lanchonete do Pedro!");
                    break;

                default:
                    System.out.println("\n⚠️ Opção inválida! Tente novamente.");
            }

            if (opcao != 4) {
                System.out.println("\nPressione ENTER para voltar ao menu...");
                sc.nextLine(); // consome quebra de linha
                sc.nextLine(); // espera o ENTER
                limparTela();
            }

        } while (opcao != 4);

    }
}
