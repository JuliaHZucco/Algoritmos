//2 - Escreva um programa Java que leia do teclado um vetor de 10 posições. Escreva na tela quantos valores pares foram armazenados nesse vetor.

import java.util.Scanner;

public class paresVet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        int pares = 0;

        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite a posição %d do vetor: \n", i);
            vetor[i] = scanner.nextInt();

            if(vetor[i] % 2 == 0)
            {
                pares++;
            }
        }
        
        System.out.println(pares);


        scanner.close();
    }
}
