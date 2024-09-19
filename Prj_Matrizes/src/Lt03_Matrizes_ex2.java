import java.util.Scanner;

public class Lt03_Matrizes_ex2 {

    public static void main(String[] args){
        
        //O exercício pede para carregar um vetor[100]
        //mas, como a entrada de dados será manual, irei usar apenas 5
        //pois demandará muito tempo e esforço desnecessário
        
        int[] vetor = new int[5];
        int i, media, soma;
        
        Scanner scanner = new Scanner(System.in);
        
        //carregando o vetor
        for(i = 0; i <= 4; i++){
            
            System.out.println("Digite o valor da posição " +i+ " do vetor: ");
            vetor[i] = scanner.nextInt();
            
        }
        
        //Calcula e exibe a média dos valores entre 10 e 200
        media = Media10_200(vetor);
        System.out.println("A média dos valores entre 1o e 200 é: " +media);
        
        //Soma e exibe apenas os números ímpares
        soma = SomaImpares(vetor);
        System.out.println("A soma dos números ímpares é: " +soma);
        
    }
    
    static int SomaImpares(int[] vetor){
       
        int soma = 0, i;
        
        for(i = 0; i <= 4; i++){
            
            if(vetor[i] % 2 != 0){
                
                soma = soma + vetor[i];
                
            }
            
        }
        
        return soma; 
       
    }
    
    static int Media10_200(int[] vetor){
        
        int media, valores = 0, div = 0, i;
        
        for(i = 0; i <= 4; i++){
            
            if(vetor[i] >= 10 && vetor[i] <= 100){
                
                valores = valores + vetor[i];
                div = div + 1;
            
            }
            
        }
        
        media = valores / div;
        
        return media;
    }
    
}
