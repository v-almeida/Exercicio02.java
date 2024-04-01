/*Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros
de tamanho igual a 5. Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +
8*9 = 140 */

import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        int produtoEscalar = 0;
        for (int i = 0; i < vetor1.length; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

        System.out.println("O produto escalar dos vetores é: " + produtoEscalar);

        scanner.close();

    }

}
