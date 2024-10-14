public class Lt02_EstRep_ex43 {
    
    public static void main(String[] args){
        
        int anos;
        
        anos = AnaMaria();
        
        System.out.println("Ana será maior que Maria em "+anos+ " anos");
 
    }
    
    static int AnaMaria(){
        
        int anos = 0;
        double a, m = 1.5;
        
        for(a = 1.10; a <= m;){
            
            a = a + 0.3;
            m = m + 0.2;
            
            anos = anos + 1;
            
        }
        
        return anos;
    }
    
}
