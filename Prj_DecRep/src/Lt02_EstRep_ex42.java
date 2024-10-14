public class Lt02_EstRep_ex42 {

    public static void main(String[] args){
        
        Serie();
        
    }
    
    //calcula a série 1 + 2/3 + 3/5.... 50/99
    static void Serie(){
    
        int i, j = 1;
        double res = 0;
        
        System.out.println("1 + ");
        
        for(i = 2; i <= 50; i++){
            
            j = j + 2;
            res =+ i / j;

            System.out.println(i+ " / " +j);
      
        }
        
        System.out.println("Resultado: " + (res+1));
        
    }
    
}
