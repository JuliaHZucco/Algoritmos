//Faça um programa Java que receba do usuário um vetor X de 10 posições. Em seguida deverão ser impressos o maior e o menor elemento desse vetor.

import java.util.Scanner;

public class vet10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int [10];

        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o valor para a posição %d do vetor: \n", i);
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++){

            if (vetor[i] < maior){
                maior = vetor[i];
            }else if (vetor[i] > menor);
                menor = vetor[i];

        }

        System.out.println(maior);
        System.out.println(menor);

        scanner.close();
    }
}
