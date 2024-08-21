/*6.1 Escreva um algoritmo que receba as letras A, E, I, O, U. A letra indica qual a classificação indicativa para filmes. 
Se a letra A for digitada, apresente a mensagem "Filme para maiores de 18 anos". 
Se a letra digitada for E, apresenta a mensagem "Filme para maiores de 20" anos. 
Se letra digitada for I apresente a mensagem "Filme para crianças de 0 a 6 anos". 
Se a letra digitada for O mensagem "Filme para crianças de 7 a 14 anos", 
se a letra digitada for U mensagem, "Filme para jovens de 15 a 17 anos".*/

import java.util.Scanner;

public class filmes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        char letra;
        String mensagem;

        System.out.println("Digite a classificação indicativa do filme (A, E, I, O, U): ");
            letra = scanner.nextLine().toUpperCase().charAt(0);

        switch (letra){

            case 'A':
                mensagem = "Filme para maiores de 18 anos";
            break;

            case 'E':
                mensagem = "Filme para maiores de 20 anos";
            break;

            case 'I':
                mensagem = "Filme para crianças de 0 a 6 anos";
            break;

            case 'O':
                mensagem = "Filme para crianças de 7 a 14 anos";
            break;

            case 'U':
                mensagem = "Filme para jovens de 15 a 17 anos";
            break;

            default:
                mensagem = "inválido";
            break;
        }

        System.out.println(mensagem);
        
        scanner.close();

        }

}
