
import java.io.*;
import java.util.Random;

public class Votacao2024 {

    public Votacao[] CadastraVotacao(Votacao[] votacao) throws IOException {

        int i;

        //Instanciando a classe Votacao() dentro dos espaços do vetor 
        //preparados para receber dados do tipo Votacao, sendo um array de 
        //objetos Votacao[]
        for (i = 0; i < 200; i++) {

            votacao[i] = new Votacao();

        }

        //instanciando o Random() para inserir os dados
        Random random = new Random();

        for (i = 0; i < 200; i++) {

            votacao[i].numeroSecao = random.nextInt(10);

            votacao[i].numeroCandidato = random.nextInt(301);

        }

        System.out.println("Gravação feita com sucesso");

        return votacao;

    }

    public Votacao[] ClassificaSessao(Votacao[] votacao) {

        int i, j;
        Votacao[] aux = new Votacao[200];

        for (i = 0; i < 200; i++) {

            aux[i] = new Votacao();

        }

        //bubble sort comum para ordenar por numero de seção
        for (i = 0; i <= 199; i++) {

            for (j = 0; j <= 199; i++) {

                if (votacao[i].numeroSecao > votacao[j].numeroSecao) {

                    aux[i] = votacao[i];

                    votacao[i] = votacao[j];
                    votacao[j] = aux[i];

                }

            }

        }

        System.out.println("Dados classificados !");
        return votacao;

    }

    public Votacao[] GravaVotacao(Votacao[] votacao) throws IOException {

        int i;
        String fileName = "votacao2024.txt";

        BufferedWriter buffer = new BufferedWriter(new FileWriter(fileName));

        for (i = 0; i <= 199; i++) {
            
            buffer.write(votacao[i].);
            
        }

        return votacao;
    }

}
