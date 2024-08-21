/*10.5) Construa um algoritmo que receba um vetor de 10 posições e depois de criado, 
leia o vetor novamente e crie um novo vetor, multiplicando por 2 o valor do primeiro vetor:

vetor 1 = 3 6 9 10 40 9 7 5 1 3

vetor multiplicado por 2 = 6 12 18 20 80 18 14 10 2 6
*/

import java.util.Scanner;
public class multip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetA = new int[10];

        for(int i = 0; i < vetA.length; i++){
            System.out.printf("Digite o valor para a poisição %d do vetor: ", i);
            vetA[i] = scanner.nextInt();
        }

        int[] vetB = new int[10];

        for(int i = 0; i < vetB.length; i++){

            vetB[i] = vetA[i] * 2;
        }

        System.out.print("Vet A: ");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print(vetA[i]);
        }
     
        System.out.println();

        System.out.print("Vet B: ");
        for (int i = 0; i < vetB.length; i++) {
            System.out.print(vetB[i]);
        }
  

        scanner.close();

    }
}