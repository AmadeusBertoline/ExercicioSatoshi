
import javax.swing.JOptionPane;

public class ClasseMetodos {
    // FUNÇÃO RECEBENDO REGISTRO aluno E RETORNANDO TIPO ALUNO[]    

    public Estatistica[] FCadastra(Estatistica[] estatistica) {
        int i;

        for (i = 0; i < 3; i++) {
            estatistica[i].codCidade = Integer.parseInt(JOptionPane.showInputDialog("Código da cidade: "));
            estatistica[i].nomeCidade = JOptionPane.showInputDialog("Nome da cidade: ");
            estatistica[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Número de acidentes: "));
        }

        return estatistica;
    }

// PROCEDIMENTO RECEBENDO REGISTRO aluno TIPO ALUNO[]    
    public void FConsulta(Estatistica[] estatistica) {
        int i;

        for (i = 0; i < 3; i++) {
            System.out.println(estatistica[i].codCidade + " " + estatistica[i].nomeCidade
                    + " pontos: " + estatistica[i].qtdAcidentes);
        }
    }

}
