/*1) Escreva um programa em Java que receba o valor da gasolina de 10 cidades diferentes. No final o programa deve apresentar 
qual a cidade tem o maior valor da gasolina, qual a cidade tem o menor valor da gasolina e qual o valor médio da gasolina das 10 cidades. */

import java.util.Scanner;

public class gaasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] gasolina = new float[10];
        int cidadeMaior = 0, cidadeMenor = 0;
        float soma = 0, media;

        for(int cidade = 0; cidade < 10; cidade++ ){
            System.out.printf("Digite o valor da gasolina da cidade %d: ", cidade + 1);
            gasolina[cidade] = scanner.nextFloat();
        }

        for(int cidade = 0; cidade < 10; cidade++){
            if(gasolina[cidade] < gasolina[cidadeMenor]){
                cidadeMenor = cidade;
            }

            if(gasolina[cidade] > gasolina[cidadeMaior]){
                cidadeMaior = cidade;
            }
        }

        for(int cidade = 0; cidade < 10; cidade++){
            soma += gasolina[cidade];
        }

        media = soma / gasolina.length;

        System.out.println("A cidade com menor valor é: " + (cidadeMenor + 1));
        System.out.println("A cidade com maior valor é: " + (cidadeMaior + 1));
        System.out.println("A média de preços da gasolina é: " + media);

        scanner.close();
    }
}