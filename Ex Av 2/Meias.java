import java.util.Scanner;

public class Meias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Lupo = 0;
        int Nike = 0;

        int[] pessoasPorDia = new int[5]; 

        for (int dia = 1; dia <= 5; dia++) {
            System.out.printf("Dia %d:\n", dia);
            System.out.print("Quantas pessoas entraram na academia nesse dia? ");
            int totalDia = scanner.nextInt();
            pessoasPorDia[dia - 1] = totalDia; 

            for (int pessoa = 1; pessoa <= totalDia; pessoa++) {
                System.out.printf("Qual marca de meias a pessoa %d usava? (Lupo ou Nike): ", pessoa);
                String marcaMeia = scanner.next().toUpperCase(); 

                switch (marcaMeia) {
                    case "LUPO":
                        Lupo++;
                        break;
                    case "NIKE":
                        Nike++;
                        break;
                    default:
                        System.out.println("SÓ ACEITAMOS NIKE OU LUPO, DIGITE NOVAMENTE!");
                        pessoa--; 
                }
            }
        }

        System.out.println("\nResultados:");
        System.out.printf("Total de pessoas usando Lupo: %d\n", Lupo);
        System.out.printf("Total de pessoas usando Nike: %d\n", Nike);
        System.out.printf("Total de pessoas que entraram na academia na sexta-feira: %d\n", pessoasPorDia[4]);

        scanner.close();
    }
}