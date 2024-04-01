/*Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de
acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar
um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo
valor lido só poderá ser maior que 5. */

import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.print("Digite o 1º número: ");
        vetor[0] = scanner.nextInt();

        for (int i = 1; i < vetor.length; i++) {
            int num;
            do {
                System.out.print("Digite o próximo número maior que " + vetor[i - 1] + ": ");
                num = scanner.nextInt();
            } while (num <= vetor[i - 1]);
            vetor[i] = num;
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }

}
