/*2) Escreva um programa em Java que avalie o ganho de peso de um grupo de cães da raça Maltês. Mensalmente o peso de 5 cães Maltês é registrado. 
Os cães são identificados pelos códigos 501 a 505. Anote o peso de cada cão por 3 meses e ao final de 3 meses mostre na tela:

 - O código do cão que mais perdeu peso durante os 3 meses.
- O código do cão que mais ganhou peso durante os 3 meses. */


import java.util.Scanner;

public class AvaliacaoGanhoPesoMaltes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // definindo a estrutura para armazenar o peso dos cães
        float[][] pesos = new float[5][3]; // 5 cães, 3 meses

        // pesos mensais dos cães
        for (int cao = 0; cao < 5; cao++) {
            int codigoCao = 501 + cao; // Códigos vão de 501 a 505
            System.out.printf("Informe o peso do cão código %d para os 3 meses:\n", codigoCao);
            for (int mes = 0; mes < 3; mes++) {
                System.out.printf("Mês %d: ", mes + 1);
                pesos[cao][mes] = scanner.nextFloat();
            }
        }

        // armazenar o código do cão com maior ganho e maior perda de peso
        int codigoMaiorGanho = 501; // Inicializando com o primeiro cão
        int codigoMaiorPerda = 501; // Inicializando com o primeiro cão
        float maiorGanho = 0;
        float maiorPerda = 0;

        // calculando o maior ganho e maior perda de peso
        for (int cao = 0; cao < 5; cao++) {
            float pesoInicial = pesos[cao][0];
            float pesoFinal = pesos[cao][2];
            float ganho = pesoFinal - pesoInicial;
            float perda = pesoInicial - pesoFinal;

            // verificando o maior ganho
            if (ganho > maiorGanho) {
                maiorGanho = ganho;
                codigoMaiorGanho = 501 + cao; // Atualizando código do cão com maior ganho
            }

            // verificando a maior perda
            if (perda > maiorPerda) {
                maiorPerda = perda;
                codigoMaiorPerda = 501 + cao; // Atualizando código do cão com maior perda
            }
        }

        // exibindo os resultados
        System.out.printf("Cão que mais perdeu peso: Código %d\n", codigoMaiorPerda);
        System.out.printf("Cão que mais ganhou peso: Código %d\n", codigoMaiorGanho);

        scanner.close();
    }
}