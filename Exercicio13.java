
/*Elabore um algoritmo que receba um número n e retorne um vetor com os n
primeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,
13, 21}. */
import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        int[] fibonacci = gerarFibonacci(n);
        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        scanner.close();
    }

    public static int[] gerarFibonacci(int n) {
        int[] fibonacci = new int[n];

        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;

    }
}
