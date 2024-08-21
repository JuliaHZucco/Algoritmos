/*10.3) Construa um algoritmo que receba um vetor de 5 posições. Nas posições serão digitados somente valores positivos. 
O algoritmo não poderá receber valores negativos. Ao final apresente.

     A quantidade de tentativas de digitação de números negativos
     O vetor impresso na ordem inversa da digitação. Por exemplo: Se digitado: 6, 8, 4, 7, 8 deve imprimir na tela: 8, 7, 4, 8, 6. */

import java.util.Scanner;

public class posVet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int vet[] = new int[5];
            int tentNeg = 0;

            for(int i = 0; i < vet.length; i++){
                System.out.printf("Digite um número positivo para a posição %d: \n", i);
                int num = scanner.nextInt();

                if (num < 0){
                    tentNeg++;
                    System.out.printf("DIGITE UM NUMERO POSITIVO SEU BURRO \n");
                    i--;
                }else{
                    vet[i] = num;
                }  
            }

            System.out.println("Vetor na ordem inversa: ");
            for (int i = vet.length - 1; i >= 0; i--) {
                System.out.println(vet[i]); 
            }

            System.out.printf("%d tentaivas de numeros negativos", tentNeg);

        scanner.close();
    }
    
}
