import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Votacao2024 {

    public Votacao[] CadastraVotacao(Votacao[] votacao) throws IOException {

        int i;
        //Nome do arquivo físico que serão escritos os dados
        String fileName = "ArquivoVotacao.txt";

        //Instancia do método que escreve no buffer
        //com o método que escreve no arquivo como parâmetro
        //junto de seu arquivo
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));

        //Instanciando a classe Votacao() dentro dos espaços do vetor 
        //preparados para receber dados do tipo Votacao, sendo um array de 
        //objetos Votacao[]
        for (i = 0; i < 200; i++) {
            
            votacao[i] = new Votacao();
            
        }
        
        //instanciando o Random() para inserir os dados
        Random random = new Random();
        
        for(i = 0; i < 200; i++){
            
            votacao[i].numeroSecao = random.nextInt(10);
            gravar.write(votacao[i].numeroSecao);
            gravar.newLine();
            
            votacao[i].numeroCandidato = random.nextInt(301);
            
        }

        return votacao;

    }
    
    

}
