/*Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor
com 5 pesos e calcule a média ponderada do aluno. 

Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3
                  ---------------------------------------------
                            peso1 + peso2 + peso3  

 Ex.: notas: 7.5, 9.2 pesos: 6, 4. Média ponderada: (7.5 * 6 + 9.2 * 4) / (6 + 4)                           
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        double notas[] = new double[5];
        double pesos[] = new double[5];

        System.out.println("Digite suas 5 notas: ");
        for (int i = 0; i < notas.length; i++) {

            System.out.println("Nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }

        for (int i = 0; i < pesos.length; i++) {
            System.out.println("Peso " + (i + 1) + ":");
            pesos[i] = scanner.nextDouble();

        }

        double somaProdutos = 0;
        double somaPesos = 0;

        for (int i = 0; i < notas.length; i++) {
            somaProdutos += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada = somaProdutos / somaPesos;

        System.out.println("A média ponderada é: " + mediaPonderada);

    }

}
