public class Lt02_EstRep_ex45 {

    public static void main(String[] args){
    
        Serie();

    }
    
    static void Serie(){
        
        double i,  res, total = 0, j = 4, inc = 5;
        
        System.out.println("1 - ");
        
        for(i = 2; i <= 15; i++){
                
            if(i == 3){
                
                j = j + 5;
                
            }
            
            if(i > 3){
                
                inc = inc + 2;
            
                j = j + inc;
                
            }
            
            res = i/j;
            
            total = res + total;
            
            System.out.println(i+ " / " +j);
            
        }
        
        System.out.println(" = " +total);
        
    }
    
}
