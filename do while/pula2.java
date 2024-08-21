/*8.2) Escreva um algoritmo que imprima na tela todos os números de 2 em 2 a partir do número 40 até o número 30. 
Saída: 40, 38...... 30. Utilize DO WHILE para resolver. */


public class pula2 {
    public static void main(String[] args) {

        int x = 40;

        do{
           
            System.out.println(x);
            x = x - 2;

        }while(x <= 40 && x >= 30);

    }
}
