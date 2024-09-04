import java.util.Scanner;

public class Lt02_EstRep_ex36 {

    public static void main(String[] args){
        
        int num;
        double res;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número");
        num = scanner.nextInt();
        
        res = Serie(num);
        
        System.out.println("Resultado da Série: "+res);
     
    }
    
    static double Serie(int num){
    
        int i;
        
        double res = 0;
        int j;
        
        for(j = num; j >= 0; j--){
        
            double fatorial = 1;
            
            for(i = j; i >= 1; i--){
            
                fatorial = i * fatorial;
            
            }
        
            res = res + (1.0/fatorial);
        
        }
        
        return res;

    }
    
}
