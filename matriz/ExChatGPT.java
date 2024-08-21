import java.util.Scanner;

public class ExChatGPT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = 3;
        int colunas = 4;
        int[][] mat = new int[linhas][colunas];

        // Entrada de dados
        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite [" + i + "][" + j + "]: ");
                mat[i][j] = scanner.nextInt();
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz informada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        // Menor elemento de cada linha
        System.out.println("\nMenor elemento de cada linha:");
        for (int i = 0; i < linhas; i++) {
            int menor = mat[i][0]; // Assume o primeiro elemento da linha como menor inicialmente
            for (int j = 1; j < colunas; j++) {
                if (mat[i][j] < menor) {
                    menor = mat[i][j];
                }
            }
            System.out.println("Linha " + i + ": " + menor);
        }

        // Maior elemento de cada coluna
        System.out.println("\nMaior elemento de cada coluna:");
        for (int j = 0; j < colunas; j++) {
            int maior = mat[0][j]; // Assume o primeiro elemento da coluna como maior inicialmente
            for (int i = 1; i < linhas; i++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
            System.out.println("Coluna " + j + ": " + maior);
        }

        scanner.close();
    }
}
