public class Lt02_EstRep_ex41 {

    public static void main(String[] args){
        
        DoisDados();
        
    }
    
    //testa as possibilidades de somar um "7" ao jogar dois dados.
    static void DoisDados(){
    
        int i, j;
        
        for(i = 1; i <= 6; i++){
            
            for(j = 1; j <= 6; j++){
                
                if(i + j == 7){
                    
                    System.out.println(i+" + " +j+ " = " + (i + j));
                    
                }
                
            }
            
        }
        
    }
    
}
