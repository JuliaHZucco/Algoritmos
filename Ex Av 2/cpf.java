/* Escreva um programa em Java que colete dados para uma pesquisa de intenção de compras para o Dia das Crianças. 
Os dados coletados devem ser: CPF da pessoa entrevistada; quantas crianças vão ganhar presente comprado pelo entrevistado e valor máximo a pagar por cada presente. 
Pessoa: 0
Total de pessoas entrevistadas: 3
Valor médio que será gasto por criança:  100,00
         

O algoritmo será finalizado quando no CPF da pessoa for digitado 0 (zero). 
Ao final o programa deve mostrar as seguintes informações: Total de pessoas entrevistadas e Valor médio que poderá ser gasto por criança.*/

import java.util.Scanner;

public class cpf{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        int cpf = 1, criancas, totP = 0, somac = 0;
        float valorMax, valorMedio, somav = 0;

        while(true){
            System.out.println("DIZ O TEU CPF: ");
            cpf = scanner.nextInt();
            if(cpf == 0){
                break;
            }

            System.out.println("VAI DAR PRESENTE PRA QUANTAS CRIANÇAS? ");
            criancas = scanner.nextInt();

            System.out.println("PODE GASTAR QUANTO DINHEIRO COM CADA PRESWENTE, PORRA? ");
            valorMax = scanner.nextFloat();

            totP++;
            
            somav = somav + valorMax; 
            somac = somac + criancas;

        }
        
        valorMedio = somav / somac;

        System.out.println(totP);
        System.out.println(valorMedio);



        scanner.close();
    }
}