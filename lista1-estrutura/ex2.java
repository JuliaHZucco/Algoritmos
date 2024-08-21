/*Escrever um programa que declare duas variáveis chamadas peso e altura.
Solicite ao usuário que digite seu peso em quilos e sua altura em metros.
Mostre na tela o peso do usuário em quilos e também em gramas, além da
altura dele em metros e em centímetros.  */

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float pesokg, pesog, alturam, alturacm;

        System.out.printf("Digite seu peso em kg: ");
        pesokg = scanner.nextFloat();

        System.out.printf("Digite sua altura em metros: ");
        alturam = scanner.nextFloat();

        pesog = pesokg * 1000;
        alturacm = alturam * 100;

        System.out.printf("Seu peso em kg e em gramas é: %.2f Kg - %.2f g", pesokg, pesog);
        System.out.printf("\nSua altura em metros e centímetros é: %.2f M - %.2f cm", alturam, alturacm);

        scanner.close();
    }
}