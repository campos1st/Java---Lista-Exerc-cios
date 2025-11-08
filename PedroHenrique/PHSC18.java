package PedroHenrique;

public class PHSC18 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC18 - Múltiplos de 3 entre 1 e 30 *");
        System.out.println("********************************\n");

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
    }
}
