/*10.2) Construa um algoritmo que receba um vetor de 5 posições, depois leia o vetor e mostre quantos destes valores digitados estão entre os números 10 e 20 
e quantos estão entre os números 21 e 30.*/

import java.util.Scanner;

public class entreVet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vet[] = new int[5];

        for(int i = 0; i < vet.length; i++){
            System.out.printf("Digite um valor entre 10 e 30 para a posição %d: ", i);
            vet[i] = scanner.nextInt();
        }

        int A = 0;
        int B = 0;

        for(int i = 0; i < vet.length; i++){
            if(vet[i] >= 10 && vet[i] <= 20){
                A++;
            }else if(vet[i] >= 21 && vet[i] <= 30){
                B++;
            }
        }

        System.out.println(A);
        System.out.println(B);

        scanner.close();
    }
}
