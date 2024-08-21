public class AsciiTable {
    public static void main(String[] args) {
        // Cabeçalho da tabela
        System.out.println("Código ASCII | Caractere");
        System.out.println("-------------|-----------");

        // Loop para imprimir todos os caracteres ASCII (0 a 127)
        for (int i = 0; i < 255; i++) {
            // Imprimir o código ASCII e o caractere correspondente
            System.out.printf("%12d | %c%n", i, (char) i);
            //System.out.printf("%d : %c\n", i, i);
        }
    }
}