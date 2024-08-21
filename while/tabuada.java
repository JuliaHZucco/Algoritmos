import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        while (contador <= 10){
            int resultado = contador * num;
            System.out.println(num + "x" + contador + "=" + resultado);
            contador++;
        }
            

        scanner.close();
    }
}