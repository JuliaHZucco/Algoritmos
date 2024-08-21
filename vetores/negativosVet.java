/*4 - Faça um programa Java que preencha um vetor de 10 números reais. 
Em seguida, calcule e mostre na tela a quantidade de números negativos e a soma dos números positivos desse vetor.*/

import java.util.Scanner;

public class negativosVet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o valor para a posição %d do vetor: \n", i);
            vetor[i] = scanner.nextInt();
        }

        int negativos = 0;
        int somaPositivos = 0;

        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] < 0){
                negativos++;
            }else{
                somaPositivos+= vetor[i];
            }
        }
        
        System.out.println("A quantidade de números negativos no vetor é: " + negativos);
        System.out.println("A soma dos números positivos no vetor é: " + somaPositivos);

        scanner.close();
    }
}
