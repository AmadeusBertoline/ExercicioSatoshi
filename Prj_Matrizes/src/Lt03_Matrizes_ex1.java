import java.util.Scanner;

public class Lt03_Matrizes_ex1 {

    public static void main(String[] args){
    
        //O exercício pede para carregar um vetor[100]
        //mas, como a entrada de dados será manual, irei usar apenas 5
        //pois demandará muito tempo e esforço desnecessário
        
        int[] vetor = new int[5];
        int i, media, impares;
        
        Scanner scanner = new Scanner(System.in);
        
        //Carregando o vetor
        for(i = 0; i <= 4; i++){
        
            System.out.println("Digite um valor para a posição: " +i+ " do vetor");
            vetor[i] = scanner.nextInt();
            
        }
        
        //Calcula e exibe qual o maior e o menor valor no vetor
        MaiorMenor(vetor);
        
        //calcula e exibe a média
        media = Media(vetor);
        System.out.println("A média dos valores é: " +media);
        
        scanner.close();
        
    }
    
    static void MaiorMenor(int[] vetor){
        
        int maior, menor, i;
        
        maior = vetor[0];
        menor = vetor[0];
        
        for(i = 0; i <= 4; i++){
            
            if(vetor[i] > maior){
                
                maior = vetor[i];
                
            }else if(vetor[i] < menor){
                
                menor = vetor[i];
                
            }
            
        }
        
        System.out.println("O maior valor é: " +maior+ ", e o menor é: " +menor);
    
    }
    
    static int Media(int[] vetor){
    
        int media = 0, i, div =  0, valores = 0;
        
        for(i = 0; i <= 4; i++){
        
            valores = valores + vetor[i];
            div = div + 1;
            
        }
        
        media = valores / div;
        
        return media;
    
    }
    
}
