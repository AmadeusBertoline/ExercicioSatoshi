import java.util.Scanner;

public class Prj_Recursividade_ex2 {

    public static void main(String[] args){
    
        int num;
        int res;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor para a série:  (N) + (N-1) + (N-2) + ... + (1) ");
        num = scanner.nextInt();
        
        res = Serie2(num);
        
        System.out.println("O resultado da soma da série é: "+res);
        
        scanner.close();
        
    }
    
    static int Serie2(int num){
        
        if(num == 1){
            
            return 1;
            
        }
        
        return num + Serie2(num - 1);
        
    }
    
}
