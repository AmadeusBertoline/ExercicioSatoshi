import java.util.Scanner;

public class Lt02_EstRep_ex40 {

    public static void main(String[] args){
    
        int n1, n2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();
        
        Primos(n1, n2);
        
        scanner.close();
        
    }
    
    static void Primos(int n1, int n2){
        
        int i, j, maior = 0, menor = 0, nPrimos = 0;
        
        //primeiro, descobrimos qual o maior numero
        //para saber em qual direção o loop vai menor -> maior
        if(n1 > n2){
        
            maior = n1;
            menor = n2;
        
        }else if(n2 > n1){
            
            maior = n2;
            menor = n1;
            
        }else{
        
            System.out.println("Os números devem ser diferentes um do outro.");

        }
        
        //nenhum dos números pode ser menor ou = a 0
        if(maior <= 0 || menor <= 0){
            
            System.out.println("Os números devem ser maiores que zero");
            
        }
        
        for(i = menor; i <= maior; i++){
            
            nPrimos = 0;
            
            for(j = 2; j < i; j++){
                
                if(i % j == 0){
                    
                    nPrimos = nPrimos + 1;
                    
                }
                
            }
            
            if(nPrimos == 0){
            
                System.out.println(i+ " é primo");
            
            }
            
        }
        
    }
    
}
