
public class Lt02_EstRep_ex31 {
    
    public static void main(String[] args){
        
        int quadrado = 0;
        int i = 0;
        
        quadrado = Quadrado(quadrado, i);
        
        System.out.println("O quadrado dos números entre 10 e 150 é: "+quadrado);
        
    }
    
    static int Quadrado(int quadrado, int i){
        
        for(i = 10; i < 151; i++){
            
            quadrado = i + quadrado;
            
        }
        
        quadrado = quadrado*quadrado;
        
        return quadrado;
        
    }
    
}
