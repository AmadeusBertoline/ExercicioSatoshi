import java.util.Scanner;

public class Lt02_EstRep_ex33 {

    public static void main(String[] args){
    
        int num;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número para a sequência: ");
        num = scanner.nextInt();
        
        System.out.println(Serie(num));
        
    }
    
    static int Serie(int num){
       
        int i = 0;
        int res = 0;
        
        for(i=1; i<=num; i++){
            
            res = res + 1/i;
            
        }
        
        return res;
        
    }
    
}
