//10.4) Construa um algoritmo que receba um vetor de 10 posições e depois de criado, leia o vetor novamente e procure e mostre o maior e o menor valor digitado.

import java.util.Scanner;
public class mMvet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet = new int[10];

        for(int i = 0; i < vet.length; i++){
            System.out.printf("Digite o valor para a poisição %d do vetor: ", i);
            vet[i] = scanner.nextInt();
        }

        int maior = vet[0];
        int menor = vet[0];

        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
            if (vet[i] < menor) {
                menor = vet[i];
            }
        }

        System.out.printf("O maior é %d \n", maior);
        System.out.printf("O menor é %d" , menor);

        scanner.close();
    }
}
