import java.util.Scanner;

public class AcademiaGinastica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Arrays para armazenar os totais de cada marca de meia
        int totalLupo = 0;
        int totalNike = 0;
        
        // Variável para armazenar o total de pessoas na sexta-feira
        int totalSexta = 0;
        
        // Loop para cada dia da semana (segunda a sexta)
        for (int dia = 1; dia <= 5; dia++) {
            System.out.printf("Informe o número de pessoas que entraram na academia na %s-feira: ", obterNomeDia(dia));
            int numeroPessoas = scanner.nextInt();
            
            // Loop para cada pessoa que entrou na academia no dia atual
            for (int pessoa = 1; pessoa <= numeroPessoas; pessoa++) {
                System.out.printf("Para a %dª pessoa que entrou na academia, digite a marca de meias (Lupo ou Nike): ", pessoa);
                String marcaMeias = scanner.next();
                
                // Converter a entrada para minúsculas antes de comparar
                marcaMeias = marcaMeias.toLowerCase();
                
                // Verificar a marca de meias e atualizar os totais correspondentes
                if (marcaMeias.equals("lupo")) {
                    totalLupo++;
                } else if (marcaMeias.equals("nike")) {
                    totalNike++;
                } else {
                    System.out.println("Marca de meias inválida. Por favor, digite Lupo ou Nike.");
                    pessoa--; // Para permitir que a mesma pessoa digite novamente
                }
            }
            
            // Se for sexta-feira, atualizar o total de pessoas na sexta-feira
            if (dia == 5) {
                totalSexta = numeroPessoas;
            }
        }
        
        // Fechar o scanner após o uso
        scanner.close();
        
        // Exibir os resultados
        System.out.println("\nResultados da semana:");
        System.out.println("Total de pessoas usando meias da marca Lupo: " + totalLupo);
        System.out.println("Total de pessoas usando meias da marca Nike: " + totalNike);
        System.out.println("Total de pessoas que entraram na academia na sexta-feira: " + totalSexta);
    }
    
    // Método para obter o nome do dia da semana com base no número
    public static String obterNomeDia(int dia) {
        switch (dia) {
            case 1: return "segunda";
            case 2: return "terça";
            case 3: return "quarta";
            case 4: return "quinta";
            case 5: return "sexta";
            default: return "dia inválido";
        }
    }
}