import java.util.Scanner;

public class MatrizDiagonais{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int lin, col;

        System.out.println("Digite os valores positivos da matriz: ");

        for(lin = 0; lin < 3; lin++)
        {
            for(col = 0; col < 3; col++)
            {
                do {
                    System.out.print("Digite [" + lin + "][" + col + "]: ");
                    matriz[lin][col] = scanner.nextInt();

                    if(matriz[lin][col] < 0)
                    {
                        System.out.println("Insira apenas numeros positivos.");
                    }  
                }  while (matriz[lin][col] < 0);
            }
        }

			System.out.println("\nMatriz: ");
			for(lin = 0; lin < 3; lin++)
        {
            for(col = 0; col < 3; col++)
            {
                System.out.print(matriz[lin][col] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nDiagonal Principal: ");
        for(lin = 0; lin < 3; lin++)
        {
            for(col = 0; col < 3; col++)
            {
                if(lin == col)
                {
                    System.out.print(matriz[lin][col] + "\t");
                }
            }
        }

        System.out.println("\nDiagonal Secundária: ");
        for(lin = 0; lin < 3; lin++)
        {
            System.out.print(matriz[lin][3 - 1 - lin] + "\t");
        }

        scanner.close();
    }
}