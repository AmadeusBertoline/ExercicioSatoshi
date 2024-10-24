
import java.io.*;
import javax.swing.JOptionPane;

public class ClasseMetodos {

    // FUNÇÃO RECEBENDO REGISTRO 
    public Estatistica[] Cadastra(Estatistica[] estatistica) {
        int i;

        for (i = 0; i < 3; i++) {
            estatistica[i].codCidade = Integer.parseInt(JOptionPane.showInputDialog("Código da cidade: "));
            estatistica[i].nomeCidade = JOptionPane.showInputDialog("Nome da cidade: ");
            estatistica[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Número de acidentes: "));
        }

        return estatistica;
    }

// PROCEDIMENTO RECEBENDO REGISTRO    
    public void ConsultaQtdAcidentes(Estatistica[] estatistica) {
        int i;

        for (i = 0; i < 3; i++) {

            if (estatistica[i].qtdAcidentes > 100 && estatistica[i].qtdAcidentes < 500) {

                System.out.println("Cidade: " + estatistica[i].codCidade + " Nome:" + estatistica[i].nomeCidade
                        + " Acidentes: " + estatistica[i].qtdAcidentes);

            }

        }
    }

    public void ConsultaEstAcidentes(Estatistica[] estatistica) {

        int i;
        int maior = estatistica[0].qtdAcidentes;
        int menor = estatistica[0].qtdAcidentes;

        for (i = 0; i < 3; i++) {

            if (estatistica[i].qtdAcidentes > maior) {

                maior = estatistica[i].qtdAcidentes;

            } else if (estatistica[i].qtdAcidentes < menor) {

                menor = estatistica[i].qtdAcidentes;

            }

        }

        JOptionPane.showMessageDialog(null, "Menor número de acidentes: " + menor
                + "\n maior número de acidentes: " + maior);

    }

    public void AcidentesAcimaMedia(Estatistica[] estatistica) {

        int i, div = 0, total = 0, media;

        for (i = 0; i < 3; i++) {

            total = total + estatistica[i].qtdAcidentes;
            div = div + 1;

        }

        media = total / div;

        for (i = 0; i <= 9; i++) {

            if (estatistica[i].qtdAcidentes > media) {

                JOptionPane.showMessageDialog(null, "Cidades acima da média de acidentes: \n"
                        + "Cod: " + estatistica[i].codCidade + " Nome: " + estatistica[i].nomeCidade + "Acidentes: " + estatistica[i].qtdAcidentes);

            }

        }

    }
}
