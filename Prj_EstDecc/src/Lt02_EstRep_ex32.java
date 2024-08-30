import java.util.Scanner;

public class Lt02_EstRep_ex32 {

    public static void main(String[] args){
        
        int num;
        
        Scanner scanner = new Scanner(System.in) ;
        
        System.out.println("Escolha o número que você quer o fatorial: ");
        num = scanner.nextInt();
        
        System.out.println("O fatorial é: " + Fatorial(num));
        
    }
    
    static int Fatorial(int num){
    
        int i, fatorial = 1;
        
        for(i = 1; i <= num ; i++){
        
            fatorial = i * fatorial;
        
        }
        
        
        
        return fatorial;
        
    }
        
    
}
