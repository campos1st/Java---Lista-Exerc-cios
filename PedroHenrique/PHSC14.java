package PedroHenrique;

public class PHSC14 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC14 - Números pares de 0 a 50 *");
        System.out.println("********************************\n");

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
