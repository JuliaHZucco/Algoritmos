import java.util.Scanner;
public class soma10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        int xT = 0;

        while(contador < 10){
            System.out.println("Digite um numero: ");
            int x = scanner.nextInt();
            contador++;

            xT = xT + x;
        }
        System.out.println(xT);

        

    scanner.close();
}
}