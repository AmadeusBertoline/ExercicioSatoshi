import java.util.Scanner;

public class Prj_Recursividade_ex4 {

    public static void main(String[] args){
    
        double num, res, i = 1.0, n;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor para a série (N/1) +(N-1 / 2) + (N-2 / 3) + .... + (1/N): ");
        num = scanner.nextInt();
        
        n = num;
        
        res = Serie4(num, i, n);
        
        System.out.println("O resultado da série é: "+res);
        
        scanner.close();
        
    }
    
    static double Serie4(double num, double i, double n){
        
        
        if(num == 1 && i == n){
            
            return num / i;
            
        }
        
        return (num / i) + Serie4(num - 1, i + 1, n);
        
    }
    
}
