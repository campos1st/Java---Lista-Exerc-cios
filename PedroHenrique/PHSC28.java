package PedroHenrique;

public class PHSC28 {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("* Aluno: Pedro Henrique Silva Campos - RA 25223 *");
        System.out.println("* Classe: PHSC28 - Soma dos pares entre 1 e 100 *");
        System.out.println("********************************\n");

        int soma = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0)
                soma += i;
            i++;
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
