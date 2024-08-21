/*10.6)  Construa um algoritmo que crie um vetor de 5 posições. Depois leia o vetor criado e crie um novo vetor com os valores de traz para frente. 
Mostre o resultado do segundo vetor criado.

VETOR 1:  3 5 9 8 7 4
VETOR 2:  4 7 8 9 5 3 */

import java.util.Scanner;

public class contraVet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vet[] = new int[5];

        for(int i = 0; i < vet.length; i++){
            System.out.printf("Digite um valor para a posição %d: ", i);
            vet[i] = scanner.nextInt();
        }

        int tev[] = new int[5];

        for(int i = tev.length - 1; i >= 0 ; i--){
            System.out.println(vet[i]); 
        }

        scanner.close();
    }
}
