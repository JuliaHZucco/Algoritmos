/*11.2) Escreva um algoritmo que receba uma matriz X de 3 linhas por 3 colunas com números inteiros positivos ou negativos.
 Depois leia a matriz X e monte uma nova matriz Y somando o número 2 a cada número. */


import java.util.Scanner;

public class soma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] X = new int[3][3];
        int[][] Y = new int[3][3];
        int l, c;

        System.out.println("Digite os valores para a matriz A: \n");
        for(l = 0; l < 3; l++){
            for(c = 0; c < 3; c++){
                System.out.print("Digite o valor [" + l + "][" + c + "] para a matriz X: ");
                X[l][c] = scanner.nextInt();
            }
            System.out.println();
        }

        for(l = 0; l < 3; l++){
            for(c = 0; c < 3; c++){
                Y[l][c] = X[l][c] + 2;
            }
        }
        
        System.out.println("\n Matriz X: ");
        for (l = 0; l < 3; l++){
            for (c = 0; c < 3; c++){
                System.out.print(X[l][c] + "\t");
            }

            System.out.println();
        }

        System.out.println("\n Matriz Y: ");
        for (l = 0; l < 3; l++){
            for (c = 0; c < 3; c++){
                System.out.print(Y[l][c] + "\t");
            }

            System.out.println();
        }

        scanner.close();

    }
}
