/*2 - Desenvolva um programa em Java em que o usuário informa 12 números inteiros, os quais devem ser armazenados em uma matriz. 
Com os dados armazenados em memória, seu programa deve exibir a matriz, e o menor elemento de cada linha, e o maior elemento de cada coluna.*/

import java.util.Scanner;

public class mat12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = 3;
        int colunas = 4;
        int [][] mat = new int[linhas][colunas];

        System.out.printf("Digite os valores da matriz: \n");

        for(linhas = 0; linhas < 3; linhas++){
            for(colunas = 0; colunas < 4; colunas++){
                System.out.print("Digite [" + linhas + "][" + colunas + "]: ");
                mat[linhas][colunas] = scanner.nextInt();
            }
        }

        //mostrando a matriz
        System.out.println("Matriz: ");
        for(linhas = 0; linhas < 3; linhas++){
            for(colunas = 0; colunas < 4; colunas++){
                System.out.print(mat[linhas][colunas] + "\t");
            }

            System.out.println();
        }
        

        //mostrando menor elemento das linhas matriz
        System.out.println("\n Menor elemento de cada linha: ");
        for(linhas = 0; linhas < 3; linhas++){
            int menor = mat[linhas][0];
            for(colunas = 0; colunas < 4; colunas++){
                if(mat[linhas][colunas] < menor){
                    menor = mat[linhas][colunas];
                }
            }

            System.out.println("O menor elemento da linha " + linhas + " é: " + menor);
        }

        System.out.println("\nMaior elemento de cada coluna:");
        for (colunas = 0; colunas < 4; colunas++) {
            int maior = mat[0][colunas]; 
            for (linhas = 0; linhas < 3; linhas++) {
                if (mat[linhas][colunas] > maior) {
                    maior = mat[linhas][colunas];
                }
            }
            System.out.println("O maior elemento da coluna " + colunas + " é: " + maior);
        }

        scanner.close();
    }
    
}
 