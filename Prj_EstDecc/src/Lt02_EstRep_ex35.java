import java.util.Scanner;

public class Lt02_EstRep_ex35 {

    public static void main(String[] args){
        
        int n1, n2;
        int res = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();
        
        res = SomaImpar(n1, n2);
        
        System.out.println("O resultado da somatória é: "+res);
        
        scanner.close();
        
    }
    
    static int SomaImpar(int n1, int n2){
        
        int maior = 0;
        int menor = 0;
        int i;
        int somatoria = 0;
        
        //verifica qual número é maior
        if(n1 > n2){
            
            maior = n1;
            menor = n2;
            System.out.println("O maior número é: "+maior);
            
        }else if(n2 > n1){
            
            maior = n2;
            menor = n1;
            System.out.println("O maior número é: "+maior);
            
        }else{
        
            System.out.println("Os dois números são iguais");
        
        }
        
        //se o número entre o maior e menor for ímpar, será somado.;
        for(i = menor; i <= maior; i++){
            
            if(i % 2 == 1){
                
                somatoria = somatoria + i;
                
            }
            
        }
        
        return somatoria;
        
    }
    
}
