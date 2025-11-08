package PedroHenrique;

public class PHSC13 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC13 - Soma dos 100 primeiros números *");
        System.out.println("********************************\n");

        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 até 100 é: " + soma);
    }
}
