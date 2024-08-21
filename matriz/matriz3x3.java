/*1 - Crie uma matriz de dimensões 3x3 a partir de números inteiros positivos lidos pelo usuário. 
Seu programa Java deve controlar que essa leitura para aceitar apenas valores válidos. 
Em seguida, exiba os elementos da diagonal principal e os elementos da diagonal secundária.*/

import java.util.Scanner;

public class matriz3x3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mat = new int[3][3];

        System.out.println("Digite os valores positivos para preencher a matriz 3x3:");
        for(int linha = 0; linha < mat.length; linha++){
            for(int coluna = 0; coluna < mat.length; coluna++){
                do{
                    System.out.printf("Digite o valor para a posição (%d, %d)", linha, coluna);
                    mat[linha][coluna] = scanner.nextInt();

                    if(mat[linha][coluna] < 0){
                        System.out.println("DIGITE SÓ NÚMEROS POSITIVOS PARCEIRO");
                    }
                }while(mat[linha][coluna] < 0);
            }
        }

        System.out.println("\n matriz: ");
        for(int linha = 0; linha < mat.length; linha++){
                for(int coluna = 0; coluna < mat.length; coluna++){
                    System.out.print(mat[linha][coluna] + "\t");
                }
                System.out.println();
        }

        System.out.println("\n diagonal principal: ");
        for(int linha = 0; linha < mat.length; linha++){
                for(int coluna = 0; coluna < mat.length; coluna++){
                    if (linha == coluna){
                        System.out.print(mat[linha][coluna] + "\t");
                    }
                }
        }

        System.out.println("\n diagonal secundária: ");
        for(int linha = 0; linha < 3; linha++){
             System.out.print(mat[linha][mat.length - 1 - linha] + "\t");
        }

        scanner.close();
    }
}
