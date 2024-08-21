public class mistery {
    public static void main(String[] args) {
        
        int x = 1;
        int total = 0;
        
        while(x <=10){
            int y = x * x;
            System.out.println(y);
            total += y; //sempre se refere a soma dos valores apresentados ou digitados 
            x++;
        }

        System.out.printf("Total is %d%n", total);
    }
}