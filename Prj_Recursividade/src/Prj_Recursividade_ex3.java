import java.util.Scanner;

public class Prj_Recursividade_ex3 {
    
    public static void main(String[] args){
        
        double num, res;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor para a série (1/1) + (1/2) + (1/3) + …+ (1/N): ");
        num = scanner.nextInt();
        
        res = Serie3(num);
        
        System.out.println("O resultado da série é: "+res);
        
        scanner.close();
    
    }
    
    //Ao invés de incrementar o valor do divisor, necessitando de uma nova
    //variável e uma condicional mais extensa, optei por decrementar na recursão
    //o valor de num, permitindo menos linhas de código e objetividade
    
    static double Serie3(double num){
    
        if(num == 1){
            
            return 1;
            
        }
        
        return (1/num) + Serie3(num - 1);
        
    }
    
}
