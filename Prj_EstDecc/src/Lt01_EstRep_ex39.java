public class Lt01_EstRep_ex39 {

    public static void main(String[] args){
        
        long res;
        
        res = Tabuleiro();
        
        System.out.println("A quantidade de grãos no tabuleiro é: " +res);
        
    }
    
    static long Tabuleiro(){
    
        int i; 
        long qtd2 = 2;
        
        //o long só armazena até este valor
        //precisaria utilizar o biginteger para solucionar
        for(i = 1; i <= 60; i++){
            
            qtd2 = qtd2 * 2;
            System.out.println(qtd2);
        }
        
        return qtd2;
    }
    
}
