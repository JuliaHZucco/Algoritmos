/*6.2) Escreva um algoritmo que receba a quantidade de um produto vendido e o valor unitário do produto. Calcule o valor total da compra. 
Se a compra for paga com cartão de crédito, aplique acrescente 10% no valor total da compra. 
Se a compra for paga por pix, dê um desconto de 10% no total da compra. 
Se a compra for paga em dinheiro dê um desconto de 20% no total da compra. 
Ao final o programa deve mostrar o valor total da compra, o valor do desconto aplicado e o valor total da compra. */

import java.util.Scanner;

public class metodo_pagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String compra;
        double desconto = 0;
        double fim = 0; 

        System.out.println("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o valor unitário do produto: ");
        double valor = scanner.nextDouble();

        double total = quantidade * valor;
        System.out.printf("O total é %.2f %n", total); // %.2f deixa com  2 casas e %n pula p proxima linha tipo ln
        
        scanner.nextLine();

        System.out.println("Digite a forma de pagamento: ");
        compra = scanner.nextLine().toLowerCase();

        switch(compra) {
            
            case "cartao":
                desconto = total * 0.10; 
                fim = total + desconto;
                break;

            case "pix":
                desconto = total * 0.10;
                fim = total - desconto;
                break;

            case "dinheiro":
                desconto = total * 0.20;
                fim = total - desconto;
                break;

            default:
                System.out.println("Opção inválida");
                break;

        }
        System.out.printf("O desconto aplicado é %.2f %n", desconto);
        System.out.printf("O valor final é %.2f %n", fim);

        scanner.close();
    }
}
