import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int maior = 0;

        while(num != -1){
            System.out.println("Digite um número: ");
            num = scanner.nextInt();
            if(num > maior)
            {
                maior = num;
            }
        }

        System.out.println("O maior é: " + maior);


        scanner.close();
    }
}
