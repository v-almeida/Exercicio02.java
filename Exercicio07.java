/*Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles
são iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem
coincidir */

import java.util.Scanner;

public class Exercicio07 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int vetor1[] = new int[5];
        int vetor2[] = new int[5];

        System.out.println("Digite 5 números: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Primeiro " + (i + 1) + ":");
            vetor1[i] = scanner.nextInt();
        }
        System.out.println("Digite outros 5 números: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Segundo " + (i + 1) + ":");
            vetor2[i] = scanner.nextInt();

        }

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i]) {
                System.out.println("Diferentes");
                break;
            } else {
                System.out.println("Iguais");
                break;
            }

        }

        scanner.close();

    }

}
