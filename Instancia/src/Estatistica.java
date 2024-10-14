
public class Estatistica {

    int codCidade;
    String nomeCidade;
    int qtdAcidentes;

    // Método Construtor	
    Estatistica() {
        this(0, "", 0);
    }

    // Método Procedimento
    Estatistica(int cod, String nome, int acidentes) {
        codCidade = cod;
        nomeCidade = nome;
        qtdAcidentes = acidentes;
    }
    
    
}
