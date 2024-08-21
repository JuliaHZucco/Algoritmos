/*8.1) Escreva um algoritmo que imprima a soma de todos os valores positivos digitados por um usuário. 
Quando for digitado um número negativo o programa deve mostrar a soma total e encerrar o programa. Use DO WHILE para resolver. */

import java.util.Scanner;
public class positivis {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double soma = 0;
    double num;

    do {
        
        System.out.println("Digite um numero: ");
        num = scanner.nextDouble();

        if (num >= 0){
            soma = soma + num; //pega o que já tem e soma com numero digitado 
        }
  
    } while (num >= 0);
    
    System.out.println(soma);

    scanner.close();
    }
}
