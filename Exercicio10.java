/*Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie
os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é o
último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim
por diante */

import java.util.Scanner;

public class Exercicio10 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = A[A.length - 1 - i];
        }

        System.out.println("Vetor B (invertido):");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        scanner.close();

    }

}
