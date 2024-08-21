/*9.3) Escreva um programa em Java que receba o número de filhos de 5 pessoas. 
Mostre a quantidade de pessoas que tem de 1 a 3 filhos, o número de pessoas que tem 4 filhos ou mais e o número de pessoas que não tem filhos. */

import java.util.Scanner;

public class filhos {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int pessoas;
        int filhos;
        int pessoas1a3 = 0;
        int pessoas4 = 0;
        int pessoas0 = 0;

        for (pessoas = 1; pessoas <= 5; pessoas++){
            System.out.println("Digite o número de filhos da pessoa " + pessoas + "  :");
            filhos = scanner.nextInt();

            if (filhos > 0 && filhos <=3){
                pessoas1a3++;
            }else if (filhos >= 4){
                pessoas4++;
            }else {
                pessoas0++;
            }
            
        } 

        System.out.println("pessoas com 1 a 3 filhos: " + pessoas1a3);
        System.out.println("pessoas com 4 filhos ou mais: " + pessoas1a3);
        System.out.println("pessoas com 0 filhos: " + pessoas1a3);

    scanner.close();

    }
}
