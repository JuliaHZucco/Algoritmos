/*Escreva um programa na linguagem Java que dada um número ele mostre a tabuada dele */

import java.util.Scanner;

public class tabuadafor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ver sua tabuada: ");
        int num = scanner.nextInt();

        int cont;
        for(cont = 0; cont <= 10; cont++){
            int tabuada = cont * num;
            System.out.println(num + "x" + cont + "=" + tabuada);
        }

        scanner.close();
    }
      
}
