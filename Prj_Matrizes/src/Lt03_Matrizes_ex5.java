import java.util.Scanner;

public class Lt03_Matrizes_ex5 {
    
    public static void main(String[] args){
    
        int[] vt20 = new int[20];
        int i, res;
        
        Scanner scanner = new Scanner(System.in);
        
        //Carrega o vetor
        
        for(i = 0; i <= 19; i++){
            
            System.out.println("Digite o valor para a posição " + i + " do vetor20: ");
            vt20[i] = scanner.nextInt();
            
        }
        
        //Calcula e exibe o resultado da fórmula
        
        res = Calculo(vt20);
        System.out.println("Resultado da fòrmula: " +res);
    
    }
    
    static int Calculo(int[] vt20){
    
        int res = 0, i;
        
        for(i = 0; i <= 9; i++){
            
            res = res + (vt20[i] - vt20[19]);
            
        }
        
        return res;
    
    }
    
}
