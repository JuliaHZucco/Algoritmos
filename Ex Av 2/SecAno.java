import java.util.Scanner;

public class SecAno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        int seculo = (ano - 1) / 100 + 1;

        System.out.printf("O ano %d pertence ao século %d \n", ano, seculo);

        scanner.close();
    }
}