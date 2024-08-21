/*Sabe-se que um arquivo de som, no formato mp3 comprime o som original
em até 12 vezes. Pergunte ao usuário, qual o tamanho (em MB) de seu
arquivo de som predileto, considerando que ele sofreu o máximo de
compressão (12 vezes). Responda qual o tamanho do arquivo original em
MB? KB? B? GB? TB? Mostre os valores na tela */
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float b, kb, mb, gb, tb, mb1;

        System.out.printf("Digite o tamanho do seu arquivo de música (MB): ");
        mb = scanner.nextFloat();

        mb1 = mb * 12;

        kb = mb * 1024;
        b = kb * 1024;
        gb = mb / 1024;
        tb = gb / 1024;

        System.out.printf("VALORES DO ARQUIVO: ");
        System.out.printf("\nB = %.2f \nKB = %.2f \nMB = %.2f \nGB = %.2f \nTB = %f ",b , kb, mb, gb, tb);


        scanner.close();
    }
}