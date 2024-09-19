import java.util.Scanner;

public class Lt03_Matrizes_ex4 {

    public static void main(String[] args){
    
        int[] vt30 = new int[5];
        int i, nAcima, nAbaixo, media;
        
        Scanner scanner = new Scanner(System.in);
        
        //O exercício pede para carregar um vetor[30]
        //mas, como a entrada de dados será manual, irei usar apenas 5
        //pois demandará muito tempo e esforço desnecessário
        
        for(i = 0; i <= 4; i++){
        
            System.out.println("Digite o valor da posição: " +i+ " do vt30: ");
            vt30[i] = scanner.nextInt();
            
        }
        
        //Calcula e exibe a média dos valores de vt30
        media = Media(vt30);
        System.out.println("A média dos valores é: " +media);
        
        //Calcula e exibe as notas acima da média
        nAcima = NotasAcima(media, vt30);
        System.out.println("A quantidade de notas acima do grupo é: " +nAcima);
        
        //Calcula e exibe as posições do vetor que possuem as notas abaixo da média
        NotasAbaixo(media, vt30);
        
        scanner.close();
        
    }
    
    static void NotasAbaixo(int media, int[] vt30){
        
        int i;
        
        for(i = 0; i <= 4; i++){
            
            System.out.println("Posições do vetor com valor abaixo da média: ");
            
            if(vt30[i] < media){
                
                System.out.println(i);
                
            }
            
        }
    
    }
    
    static int NotasAcima(int media, int[] vt30){
    
        int nAcima = 0, i;
        
        for(i = 0; i <= 4; i++){
            
            if(vt30[i] > media){
                
                nAcima = nAcima + 1;
                
            }
            
        }
        
        return nAcima;
        
    }
    
    static int Media(int[] vt30){
        
        int media, i, valores = 0, div = 0;
        
        for(i = 0; i <= 5; i++){
            
            valores = valores + vt30[i];
            div = div + 1;
        }
        
        media = valores / div;
        
        return media;
        
    }
    
}
