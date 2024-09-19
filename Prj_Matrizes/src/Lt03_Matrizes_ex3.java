import java.util.Scanner;

public class Lt03_Matrizes_ex3 {

    public static void main(String[] args){
        
        int[] vt1 = new int[3];
        int[] vt2 = new int[3];
        int i;
        
        Scanner scanner = new Scanner(System.in);
        
        //Lê o vetor 1
        for(i = 0; i <= 2; i++){
            
            System.out.println("Digite o valor " +i+ " do vt1: ");
            vt1[i] = scanner.nextInt();
            
        }
        
        //Lê o vetor 2
        for(i = 0; i <= 2; i++){
            
            System.out.println("Digite o valor " +i+ " do vt2: ");
            vt2[i] = scanner.nextInt();
            
        }
        
        Concatenar(vt1, vt2);
        
        scanner.close();
        
    }
    
    static void Concatenar(int[] vt1, int[] vt2){
    
        int[] vt3 = new int[6];
        int i, continua = 0;
        
        //O vt3 é preenchido como todos os valores do vt1
        //Também é criado um valor para saber qual foi a 
        //Última posição do vt3, podendo continuar a partir dela
        
        System.out.println("Vt1: ");
        
        //Preenche parte do vt3 e exibe cada valor do vt1
        for(i = 0; i <=2; i++){
            
            vt3[i] = vt1[i];
            continua = continua + 1;
            System.out.println(vt1[i]);
            
        }
        
        System.out.println("Vt2: ");

        //Preenche parte do vt3 e exibe cada valor do vt2

        for(i = 0; i <= 2; i++){
            
            vt3[continua] = vt2[i];
            continua = continua + 1;
            System.out.println(vt2[i]);
            
        }
        
        //Aqui eu exibo o conteúdo do vt3 para provar que 
        //a concatenação deu certo, não uso a função lenght 
        //pois não é a proposta ainda, somente estruturas simples
        
        System.out.println("Vt3: ");

        for(i = 0; i <= 5; i++){
            
            System.out.println(vt3[i]);
            
        }
        
    }
    
}
