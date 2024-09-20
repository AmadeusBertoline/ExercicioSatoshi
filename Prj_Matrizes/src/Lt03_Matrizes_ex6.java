import java.util.Scanner;

public class Lt03_Matrizes_ex6 {

    public static void main(String[] args){
        
        int[] vt20 = new int[20];
        int i;
        
        for(i = 0; i <= 19; i++){
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor para a posição:" +i+ " do vetor");
            vt20[i] = scanner.nextInt();
        
        }
        
        BubbleSort(vt20);
        
    }
    
    static void BubbleSort(int[] vt20){
        
        int i, j, aux;
        
        for(i = 0; i <= 19; i++){
            
            for(j = 0; j <= 18; j++){
                
                if(vt20[j] > vt20[j+1]){
                    
                    aux = vt20[j];
                    vt20[j] = vt20[j+1];
                    vt20[j+1] = aux;
                    
                }
                
            }
            
        }
        
        for(i = 0; i <= 19; i++){
            
            System.out.println(vt20[i]);
            
        }
        
    }
    
}
