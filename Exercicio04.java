/*Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma
variável de um número n qualquer, depois mostre na tela o índice dos elementos que
são inferiores a n. */

import java.util.Scanner;

public class Exercicio04 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[5];

        System.out.println("Insira o valor de N: ");
        int n = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite números: ");
            vetor[i] = scanner.nextInt();
            int num = vetor[i];

            if (num < n) {
                System.out.println("O índice " + "[" + i + "]" + " é menor que " + n);
            }

            scanner.close();

        }

    }

}
