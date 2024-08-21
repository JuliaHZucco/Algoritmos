import java.util.Scanner;

public class AcademiaMeias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar o total de pessoas por marca de meia
        int totalLupo = 0;
        int totalNike = 0;

        // Variáveis para armazenar o total de pessoas por dia
        int totalSegunda = 0;
        int totalTerca = 0;
        int totalQuarta = 0;
        int totalQuinta = 0;
        int totalSexta = 0;

        // Loop para cada dia da semana
        for (int dia = 1; dia <= 5; dia++) {
            System.out.printf("Dia %d: \n", dia);

            // Obter a quantidade de pessoas que entraram na academia
            System.out.print("Quantas pessoas entraram na academia? ");
            int totalDia = scanner.nextInt();

            // Registrar a marca de meias para cada pessoa
            for (int pessoa = 1; pessoa <= totalDia; pessoa++) {
                System.out.printf("Marca de meias da pessoa %d (Lupo ou Nike): ", pessoa);
                String marcaMeia = scanner.next().toUpperCase();

                switch (marcaMeia) {
                    case "LUPO":
                        totalLupo++;
                        break;
                    case "NIKE":
                        totalNike++;
                        break;
                    default:
                        System.out.println("Marca de meia inválida!");
                }
            }

            // Atualizar o total de pessoas por dia
            switch (dia) {
                case 1:
                    totalSegunda = totalDia;
                    break;
                case 2:
                    totalTerca = totalDia;
                    break;
                case 3:
                    totalQuarta = totalDia;
                    break;
                case 4:
                    totalQuinta = totalDia;
                    break;
                case 5:
                    totalSexta = totalDia;
                    break;
            }
        }

        // Exibir os resultados finais
        System.out.println("\nResultados Finais:");
        System.out.printf("Total de pessoas com meias Lupo: %d\n", totalLupo);
        System.out.printf("Total de pessoas com meias Nike: %d\n", totalNike);
        System.out.printf("Total de pessoas na sexta-feira: %d\n", totalSexta);

        scanner.close();
    }
}