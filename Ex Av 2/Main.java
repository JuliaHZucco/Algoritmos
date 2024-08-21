import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    float[][] peso = new float[5][4];
        float[] ganhoPeso = new float[5];
	    float maisPeso = 0, menosPeso = 100; 
        int maisPesoCao = 0, menosPesoCao = 0;
	    int lin, col;
	    int cao = 501;
	    int mes = 1;
	    
        for(lin = 0; lin < 5; lin++)
        {
            for(col = 0; col < 4; col++)
            {
                if(col == 0)
                {
                    peso[lin][col] = lin + 501;
                }
                else
                {
                    System.out.printf("Mes %d: \n", mes);
                    System.out.printf("Digite o peso do cachorro %d no mes %d: ", cao, mes);
                    peso[lin][col] = scanner.nextFloat();
                    mes++;
                    if(col == 3)
                    {
                        cao++;
                        mes  = 1;
                        ganhoPeso[lin] = peso[lin][col] - peso[lin][col - 2];
                    }  
                }
            }
	    }
        for(lin = 0; lin < 5; lin++)
        {
            if(ganhoPeso[lin] > maisPeso)
            {
                maisPeso = ganhoPeso[lin];
                maisPesoCao = lin + 501;
            }

            if(ganhoPeso[lin] < menosPeso)
            {
                menosPeso = ganhoPeso[lin];
                menosPesoCao = lin + 501;
            }
        }

        System.out.println();
        System.out.println("O cachorro que mais ganhou peso foi o " + maisPesoCao + ":" + maisPeso + "kg");
        System.out.println("O cachorro que mais perdeu peso foi o " + menosPesoCao + ":" + menosPeso + "kg");
        
        scanner.close();
    }
}