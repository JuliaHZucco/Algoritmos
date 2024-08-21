import java.util.Scanner;

public class MatrizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite a dimensão positiva da matriz: ");
            n = scanner.nextInt();
        } while (n < 0);

        int[][] matriz = new int[n][n];
        int lin, col;
        
        for (lin = 0; lin < n; lin++) {
            for (col = 0; col < n; col++) {
                if (lin == col) {
                    matriz[lin][col] = 1;
                }
                else {
                    matriz[lin][col] = 0;
                }
            }
        }

        System.out.println("Matriz: ");
        for (lin = 0; lin < n; lin++) {
            for (col = 0; col < n; col++) {
                System.out.print(matriz[lin][col] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
