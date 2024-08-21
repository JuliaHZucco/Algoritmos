/*10.7) Construa um algoritmo que crie um vetor de 5 posições. 
Ao digitar os valores do vetor some os valores digitados e ao final apresente a média destes valores. 
Depois leia novamente o vetor e verifique quantos valores digitados estão acima da média, quantos estão na média e quantos estão abaixo da média.
 */

 import java.util.Scanner;
 public class mediaVet {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         int[] vet = new int[5];
         int soma = 0;
         int media = 0;
         int acima = 0;
         int dentro = 0;
         int abaixo = 0;
 
         for(int i = 0; i < vet.length; i++){
             System.out.printf("Digite o valor para a poisição %d do vetor: ", i);
             vet[i] = scanner.nextInt();

             soma = soma + vet[i];
         }

        media = soma / vet.length;
        
        for(int i = 0; i < vet.length; i++){

            if(vet[i] > media){
                acima++;
            }else if(vet[i] < media){
                abaixo++;
            }else{
                dentro++;
            }
        }
        
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Acima da Média: " + acima);
        System.out.println("Abaixo da Média: " + abaixo);
        System.out.println("Na Média: " + dentro);


        scanner.close();
        
        }
    }