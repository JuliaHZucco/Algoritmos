/*3 - Proponha um programa em Java que lê uma matriz A, com 2 linhas e 2 colunas. A matriz A deve aceitar apenas números positivos. 
O programa também deve ter uma matriz B com as mesmas dimensões de A, por sua vez, inicializada como valor 2 em todas as posições. 
A partir das duas matrizes, crie a matriz R, correspondente ao resto da divisão inteira dos elementos 
correspondentes nas matrizes A e B, e a exiba no formato de matriz. */

import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = 2;
        int c = 2;

        int[][] A = new int[l][c];
        int[][] B = new int[l][c];
        int[][] R = new int[l][c];


        System.out.println("Digite os valores positivos para a matriz A: ");
        for(l = 0; l < 2; l++){
            for(c = 0; c < 2; c++){
                do{
                System.out.print("Digite [" + l + "][" + c + "]: ");
                A[l][c] = scanner.nextInt();

                }while(A[l][c] < 0);
            }
        }

        for(l = 0; l < 2; l++){
            for(c = 0; c < 2; c++){
                B[l][c] = 2;
            }
        }

        for(l = 0; l < 2; l++){
            for(c = 0; c < 2; c++){
               R[l][c] = A[l][c] % B[l][c];
            }
        }

        System.out.println("\nMatriz A:");
        printMatriz(A); 

        System.out.println("\nMatriz B:");
        printMatriz(B); 

        System.out.println("\nMatriz R:");
        printMatriz(R); 

        scanner.close();
    } 
    
    //metodo exibir matriz
    public static void printMatriz(int[][] matriz) {
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }
    }
}
