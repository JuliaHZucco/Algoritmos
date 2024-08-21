/* Escreva um programa na linguagem Java que receba 2 notas de 3 alunos e mostre a média de cada aluno. (use FOR) */

import java.util.Scanner;

public class mediafor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int alunos;
        for(alunos = 1; alunos <= 3; alunos++) {
            System.out.println("Digite duas notas do aluno " + alunos + ": ");
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2)/2;
            System.out.printf("A media é %.2f %n: " , media);

        }

    scanner.close();
    }
}
