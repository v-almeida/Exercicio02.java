/* Elabore um programa que leia 5 números do teclado e os armazene em um vetor.
Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes
que o número n aparece no vetor.*/

import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[5];

        System.out.println("Digite uma sequência de 5 números: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            vetor[i] = scanner.nextInt();
            int num = vetor[i];
        }

        System.out.println("Digite um número N: ");
        int n = scanner.nextInt();

        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] == n) {
                contador++;
            }

        }

        System.out.println("Este número aparece " + contador + " vezes.");

    }

}
