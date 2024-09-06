import java.util.Scanner;

public class Lt02_EstRep_ex38 {

    public static void main(String[] args){
    
        int num;
        int i;
        int maior = 0;
        int menor = 1;
        
        Scanner scanner = new Scanner(System.in);
        
        for(i = 1; i <= 4; i++){
            
            System.out.println("Digite um número: ");
            num = scanner.nextInt();
            
            if(num > maior){
                
                maior = num;
                
            }
            if(num < maior || num < menor){
                
                menor = num;
            
            }
            
        }
        
        System.out.println(maior+ " " +menor);
    }
    
}
