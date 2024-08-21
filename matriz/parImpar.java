/*5 - Faça um programa em Java que leia dois vetores, denominados A e B, de 5 elementos cada um, respeitando as seguintes regras:

- Vetor A deve conter apenas valores pares;

- Vetor B deve conter apenas valores ímpares.

A partir dos dois vetores, crie uma matriz que:

Na primeira linha armazene o vetor A
Na segunda linha armazene o vetor B
Na terceira linha, contenha para cada coluna a soma dos elementos da primeira e da segunda linha correspondentes à mesma coluna.
Por fim, exiba a matriz resultante organizada em linhas e colunas. */

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetA = new int[5];
        int[] vetB = new int[5];
        int[][] matriz = new int[3][5];

        for (int i = 0; i < 5; i++){
            do {

            System.out.printf("Digite um valor PAR para a posição %d do vetor: ", i );
            vetA[i] = scanner.nextInt();

            } while(vetA[i] % 2 != 0);
        }

        for (int i = 0; i < 5; i++){
            do {

            System.out.printf("Digite um valor ÍMPAR para a posição %d do vetor: ", i );
            vetB[i] = scanner.nextInt();

            } while(vetB[i] % 2 == 0);
        }

        for (int i = 0; i < 3; i++) {
            matriz[0][i] = vetA[i];
        }

        for (int i = 0; i < 3; i++) {
            matriz[1][i] = vetB[i];
        }

        for (int i = 0; i < 3; i++) {
            matriz[2][i] = vetA[i] + vetB[i];
        }

        System.out.println("\n Matriz: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <matriz.length; j++){
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }

        scanner.close();
    }
}
