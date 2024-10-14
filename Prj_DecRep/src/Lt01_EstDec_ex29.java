import java.util.Scanner;

public class Lt01_EstDec_ex29 {
    
    public static void main(String[] args){
        
        int tipo;
        double valor, vCorrigido = 0, poupanca, fixa;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual investimento deseja fazer ?: (1 = poupança e 2 = renda fixa)");
        tipo = scanner.nextInt();
        
        System.out.println("Quanto deseja investir?: ");
        valor = scanner.nextInt();
        
        poupanca = 3.0/100;
        
        fixa = 5.0/100;
        
        if(tipo == 1){
            
            vCorrigido = valor + (valor*poupanca);
            
        }if(tipo == 2){
        
            vCorrigido = valor + (valor * fixa);
            
        }else{
        
            System.out.println("Opção inválida.");
        
        }
        
        System.out.println("Seus rendimentos foram de: "+valor+ " para " +vCorrigido);
        
        scanner.close();
        
    }
    
    
}
