/*1 - Faça um programa Java que leia um vetor de oito posições. 
Em seguida, leia também dois valores X e Y quaisquer correspondentes as duas posições no vetor. 
Seu programa deverá exibir a soma dos valores encontrados nas respectivas posições X e Y.*/

import java.util.Scanner;

public class vetor8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[8];
        int X = 0, Y = 0;

//inicializa variavel, diz ate onde ela vai e diz oq fazer com ela
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite a posição %d do vetor: \n", i );
            //digite a posição 0 do vetor
            vetor[i] = scanner.nextInt();
        }

        do {
             System.out.println("Digite a posição X do vetor (0 a 7): "); 
             X = scanner.nextInt();
        } while (X < 0 || X > 7);

        do {
            System.out.println("Digite a posição Y do vetor (0 a 7): "); 
            Y = scanner.nextInt();
       } while (Y < 0 || Y > 7);

       int soma = vetor[X] + vetor[Y];

       System.out.println("O resultado da soma é: " + soma);

    scanner.close();
    }
}
