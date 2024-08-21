import java.util.Scanner;
public class senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma senha: ");
        int senha = scanner.nextInt();

        while (senha != 345){
        System.out.println("Digite uma senha: ");
        senha = scanner.nextInt();
        }

        scanner.close();
    }
}
