/*10.1) Construa um algoritmo que receba um vetor de 5 posições. 
Nas posições serão digitados valores positivos e negativos. 
Ao final apresente:
A quantidade de valores positivos digitados
A quantidade de valores negativos digitados
A soma de todos os valores positivos digitados
A soma de todos os valores negativos digitados*/

import java.util.Scanner;

public class vet5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int vet[] = new int[5];
        int somaNeg = 0;
        int somaPos = 0;

        for (int i = 0; i < vet.length; i++){
            System.out.printf("Digite o valor da posição %d (positivo ou negativo): ", i);
            vet[i] = scanner.nextInt();

        }

        int positivos = 0;
        int negativos = 0;

        for(int i = 0; i < vet.length; i++){
            if(vet[i] < 0){
                negativos++;
                somaNeg = somaNeg + vet[i];
            }else{
                positivos++;
                somaPos = somaPos + vet[i];
            }
        }

        System.out.println("A quantidade de valores negativos é: " + negativos);
        System.out.println("A quantidade de valores positivos: " + positivos);
        System.out.println("A soma dos valores positivos é: " +somaPos);
        System.out.println("A soma dos valores negativos é: " + somaNeg);

        scanner.close();

    }
}