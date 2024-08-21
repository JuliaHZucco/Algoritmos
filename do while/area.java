/*8.3) Escreva um algoritmo que calcule a área de um retângulo ou de um triângulo. 
O programa deve ter um menu de opções para a escolha do cálculo da área do retângulo ou do triângulo. A terceira opção é para encerrar o programa. 
A fórmula de cálculo da área do retângulo é: area = base x altura e da área do triângulo é: area = (base * altura) / 2 */

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do{

            System.out.println("Voce deseja descobrir a área do retangulo (1) ou do triangulo (2)?");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Digite o valor da altura do retangulo: ");
                    double alturaRet = scanner.nextDouble();

                    System.out.println("Digite o valor da base do retangulo: ");
                    double baseRet = scanner.nextDouble();

                    double areaRet = (baseRet * alturaRet);

                    System.out.printf("A área do Ret é %.2f %n", areaRet);

                    break;
                
                case 2:

                    System.out.println("Digite o valor da altura do triangulo: ");
                    double alturaTri = scanner.nextDouble();

                    System.out.println("Digite o valor da base do triangulo: ");
                    double baseTri = scanner.nextDouble();

                    double areaTri = (baseTri * alturaTri)/2;

                    System.out.printf("A área do Tri é %.2f %n", areaTri);

                    break;
            }

        }while(opcao != 3);

        scanner.close();
    }
}
