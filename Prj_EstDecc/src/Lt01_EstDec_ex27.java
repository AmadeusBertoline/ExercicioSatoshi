import java.util.Scanner;

public class Lt01_EstDec_ex27 {

    public static void main(String[] args){
        
        int nVoltas;
        double extensao, duracao, vMedia;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número de voltas completas no circuito");
        nVoltas = scanner.nextInt();
        
        System.out.println("Digite a extensão do circuito em metros");
        extensao = scanner.nextInt();
        
        System.out.println("Digite o tempo levado para concluir todas as voltas");
        duracao = scanner.nextInt();
        
        //cálculo da velocidade média;
        vMedia = ((nVoltas * extensao)/1000)/(duracao/60);
        
        System.out.println("A velocidade média é: "+vMedia);
        
        scanner.close();
        
    }
    
}
