import java.util.Scanner;

public class Lt02_EstRep_ex37 {

    public static void main(String[] args){
        
        int num;
        int res;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o N'ésimo termo para a série de fibonacci");
        num = scanner.nextInt();
        
        res = Fibonacci(num);
        
        
    }
    
    static int Fibonacci(int num){
    
        int i;
        int f = 0;
        int a = 0;
        int b = 1;
        
        
        for(i = 2; i < num; i++ ){
            
            f = a + b;
            
            System.out.println(f);
            a = b;
            b = f;
            
        }
        
        return f;
    }
    
}
