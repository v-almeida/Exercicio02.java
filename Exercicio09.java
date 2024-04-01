/*Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C
de acordo com as seguintes regras:

a. Os elementos das posições pares de C são os elementos das posições pares de A;
b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;

 */

import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        int[] C = new int[5];

        System.out.println("Digite os numeros do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Números " + (i + 1) + ": ");
            A[i] = scanner.nextInt();

        }

        System.out.println("Digite os numeros do vetor A:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Números " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0) {
                C[i] = A[i];
            } else {
                C[i] = B[i];
            }
        }

        System.out.println("Vetor C gerado:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }

        scanner.close();
    }

}
