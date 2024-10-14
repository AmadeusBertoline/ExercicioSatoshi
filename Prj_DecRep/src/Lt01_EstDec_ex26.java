import java.util.Scanner;

public class Lt01_EstDec_ex26 {
    
    public static void main(String[] args){
        
        int n1, n2, maior, menor;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();
        
        if(n1 > n2){
            
            maior = n1;
            menor = n2;
            
        }else{
        
            maior = n2;
            menor = n1;
            
        }
        
        if(maior % menor == 0){
            
            System.out.println("O maior número é múltiplo do menor");
            
        }else{
        
            System.out.println("O maior número não é múltiplo do menor");
            
        }
        
        
        scanner.close();
    }
    
}
