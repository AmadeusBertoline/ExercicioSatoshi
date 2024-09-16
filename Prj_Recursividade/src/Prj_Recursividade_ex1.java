public class Prj_Recursividade_ex1 {

    public static void main(String[] args){
    
        int i = 1;
        int res;
        
        res = Serie1(i);
        
        System.out.println("A soma dos números de 1 até 100 é: "+res);
    
    }
    
    //A função recursiva altera o valor do parametro "i" para i + 1 até somar
    //100
    static int Serie1(int i){
        
        if(i == 100){
            
            return 100;
            
        }
        
        return i + Serie1(i + 1);
        
    }
    
}
