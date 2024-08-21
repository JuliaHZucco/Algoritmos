import java.util.Scanner;
public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;
        int soma = 0;

        while(num > 0){
            System.out.println("Digite um numero: ");
            num = scanner.nextInt();
            soma += num;
            System.out.println("O resultado da soma é: " + soma);
        }

        scanner.close();
    }
}