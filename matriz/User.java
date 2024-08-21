/*4 - Proponha um algoritmo, em Java, que realize a inicialização da matriz quadrada de x elementos informados pelo usuário, 
em que a diagonal principal tem todos os elementos igual a um e os demais iguais a zero. */

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas e colunas da matriz: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        int l, c;

        for (l = 0; l < n; l++) {
            matriz[l][l] = 1; // Define o elemento da diagonal principal como 1
        }

        System.out.println("Matriz: ");
        for (l = 0; l < n; l++) {
            for (c = 0; c < n; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
