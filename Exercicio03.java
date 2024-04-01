/*Faça um programa que leia em um vetor uma sequência finita de números digitados
pelo usuário. Crie um segundo vetor que armazene o dobro de cada número do
primeiro vetor e depois apresente os valores deste vetor */

import java.util.Scanner;

public class Exercicio03 {

    public static void executar() {

        Scanner scanner = new Scanner(System.in);

        // definindo a quantidade de numeros do vetor.

        System.out.println("Quantidade de Números: ");
        int quantidade = scanner.nextInt();

        int vetor[] = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Número: ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < quantidade; i++) {
            int dobro = vetor[i] * 2;
            System.out.println("Dobro: " + dobro);
        }

    }

}
