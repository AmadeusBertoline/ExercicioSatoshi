import java.util.Scanner;

public class Lt01_EstDec_ex28 {
    
    public static void main(String[] args){
        
        double preco, novoPreco;
        int mediaVenda;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o preço atual do produto");
        preco = scanner.nextInt();
        
        System.out.println("Digite a média de vendas do produto");
        mediaVenda = scanner.nextInt();
        
        if(mediaVenda < 500 && preco < 30){
            
            novoPreco = preco + (preco*(10.0/100));
            System.out.println("Novo preço\t de: "+preco+" para: "+novoPreco);
            
        }else if(mediaVenda >=500 && mediaVenda < 1000 && preco >= 30 && preco < 80){
            
            novoPreco = preco + (preco*(15.0/100));
            System.out.println("Novo preço\t de: "+preco+" para: "+novoPreco);
            
        }else if(mediaVenda >= 1000 && preco >= 80){
            
            novoPreco = preco - (preco*(5.0/100));
            System.out.println("Novo preço\t de: "+preco+" para: "+novoPreco);
            
        }else{
        
            System.out.println("O preço do produto não sofreu alterações: "+preco);
        
        }
        
        scanner.close();
        
        
    }
    
}
