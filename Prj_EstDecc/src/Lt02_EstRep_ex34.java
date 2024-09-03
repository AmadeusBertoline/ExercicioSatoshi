import java.util.Scanner;

public class Lt02_EstRep_ex34 {

    public static void main(String[] args){
        
        int num;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número que deseja saber a tabuada");
        num = scanner.nextInt();
        
        Tabuada(num);
        
    }
    
    static void Tabuada(int num){
    
        int i;
        
        for(i = 1; i <= 10; i++){
            
            System.out.println(num+ " * " +i+ " = " +num*i);
            
        }
        
    }
    
}
