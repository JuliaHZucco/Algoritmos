/*5 - Faça um programa Java que receba do usuário dois arrays, A e B, com 10 números inteiros cada. 
Crie um novo array C = A – B, mostre na tela os dados do array C.*/



import java.util.Scanner;

public class vet3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        for(int i = 0; i < A.length; i++){
            System.out.printf("Digite o valor para a poisção %d do vetor A: ", i);
            A[i] = scanner.nextInt();
        }

        for(int i = 0; i < B.length; i++){
            System.out.printf("Digite o valor para a poisção %d do vetor B: ", i);
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] - B[i];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }

        scanner.close();
    }
}
