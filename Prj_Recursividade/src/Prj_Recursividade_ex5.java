import java.util.Scanner;

public class Prj_Recursividade_ex5 {

    public static void main(String[] args){
    
        double num, res;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor para a sequência (N)! + (N-1)! + (N-2)! + ... + (1)!: " );
        num = scanner.nextInt();
        
        res = Serie5(num);
        
        System.out.println("O resultado da série é: "+res);
        
    }
    
    static double Serie5(double num){
        
        if(num == 1){
        
            return 1;
        
        }
        
        return Fatorial(num) + Serie5(num - 1);
        
    }
    
    static double Fatorial(double num){
        
        if(num == 1){
        
            return 1;
            
        }
        
        return num * Fatorial(num - 1);
        
    }
    
}
