/*Construa um programa que leia em um vetor uma sequência de 5 números digitados
pelo usuário, calcule a média e apresente na tela quais valores são menores, iguais
ou superiores à média. */

import java.util.Scanner;

public class Exercicio01 {
    public static void executar() {

        int[] vetor = new int[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de 5 números: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        System.out.println("Média: " + media);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println("\n" + vetor[i] + " Menor que a média.");
            } else if (vetor[i] == media) {
                System.out.println("\n" + vetor[i] + " Igual a média.");
            } else if (vetor[i] > media) {
                System.out.println("\n" + vetor[i] + " Superior a média.");
            }
        }

        scanner.close();
    }
}
