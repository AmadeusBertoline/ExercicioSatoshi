import java.util.Scanner;

public class Lt02_EstRep_ex44 {
    
    public static void main(String[] args){
    
        int base, expoente, res;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da base: ");
        base = scanner.nextInt();
        
        System.out.println("Digite o valor do expoente: ");
        expoente = scanner.nextInt();
        
        res = Potencia(base, expoente);
        
        System.out.println("O valor da potência é: " +res);
        
        scanner.close();
        
    }
    
    static int Potencia(int base, int expoente){
        
        int i;
        int res = 1;
        
        //nes trecho, multiplico o valor da base N vezes
        //de acordo com o número do expoente
        for(i = 1; i <= expoente; i++){
            
            res = base * res;
            
        }
        
        return res;
    }
    
}
