/*Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione
o maior elemento na última posição do vetor. Nenhum número do vetor pode ser
apagado ou duplicado. Apresente o vetor atualizado na tela. */

import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite os 5 elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int maxElemento = vetor[0];
        int maxIndex = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maxElemento) {
                maxElemento = vetor[i];
                maxIndex = i;
            }
        }

        int temp = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = vetor[maxIndex];
        vetor[maxIndex] = temp;

        System.out.println("Vetor atualizado com o maior elemento na última posição:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        scanner.close();
    }

}
