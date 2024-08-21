/*6.3) Escreva um programa em Java que receba os números de 1 a 12 e mostre na tela o mês referente ao número digitado. 
 O programa não deve aceitar números diferentes do intervalo de 1 a 12, caso seja digitado a mensagem "Este mês não existe" deve ser apresentado na tela. */

import java.util.Scanner;

public class mês {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        switch (numero){
            case 1:
                System.out.println("janeiro");
                break;
            
            case 2:
                System.out.println("fev");
                break;
        
            default:
                System.out.println("Este mês não existe");
                break;
        }

        scanner.close();
    }
}

//incompleto