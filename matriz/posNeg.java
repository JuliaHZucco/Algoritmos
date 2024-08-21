/*11.1) Escreva um algoritmo que receba uma matriz de 3 linhas por 3 colunas com números inteiros positivos ou negativos. 
Depois leia a matriz novamente e conte quantos números positivos e negativos foram digitados. */

import java.util.Scanner;

public class posNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int l, c;

        for (l = 0; l < 3; l++){
            for (c = 0; c < 3; c++){
                System.out.print("Digite o valor [" + l + "][" + c + "] para a matriz: ");
                mat[l][c] = scanner.nextInt();
            }
        }

        int pos = 0;
        int neg = 0;

        for (l = 0; l < 3; l++){
            for (c = 0; c < 3; c++){
                
                if(mat[l][c] < 0){
                    neg++;
                } else {
                    pos++;
                }
            }
        }

        System.out.println("\n Matriz: ");
        for (l = 0; l < 3; l++){
            for (c = 0; c < 3; c++){
                System.out.print(mat[l][c] + "\t");
            }

            System.out.println();
        }
        
        System.out.println("Negativos: " + neg);
        System.out.println("Positivos: " + pos);

        scanner.close();
    }
}
