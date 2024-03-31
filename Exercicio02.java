/*Escreva um algoritmo que leia em um vetor uma sequência finita de números
digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se
ele é positivo, negativo ou zero */

import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);

        // sequência requerida pelo usuário.

        System.out.println("Quantos números desejados: ");
        int quantidade = scanner.nextInt();

        // vetor.

        int vetor[] = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {

            System.out.println("O número está na posição " + "[" + i + "]" + ":");
            vetor[i] = scanner.nextInt();

        }

        // positivo, negativo ou zero.

        for (int i = 0; i < quantidade; i++) {
            int num = vetor[i];

            if (num > 0) {
                System.out.println("O número " + num + " na posição " + "[" + i + "]" + " É Positivo!");

            } else if (num < 0) {
                System.out.println("O número " + num + " na posição " + "[" + i + "]" + " É Negativo!");
            } else {
                System.out.println("O número " + num + " na posição " + "[" + i + "]" + " É Zero!");
            }
        }

    }

}
