import javax.swing.*;
class Principal {   //  CLASSE PRINCIPAL
 public static void main ( String[] args )
 {
   // INSTÂNCIA DA CLASSE ABSTRATA COM 3 REGISTROS TIPO VETOR 
   Estatistica[ ] estatistica = new Estatistica[3]; 
   
   // INSTÂNCIA DA CLASSE MÉTODOS
   ClasseMetodos m = new ClasseMetodos();
   
    int i;

  // EXECUÇÃO DO MÉTODO CONSTRUTOR
  // LIMPEZA DE VARIÁVEL
  for (i = 0 ; i < 3 ; i++){
       estatistica[i] = new Estatistica(); }
 
  int opc = 0 ;
  while (opc!=9){
     opc = Integer.parseInt(JOptionPane.showInputDialog
              ("1 -  Cadastra Estatistica \n 2 - Consulta Registros \n 9 - Finaliza"));
     switch (opc) {
            case 1:  estatistica = m.FCadastra(estatistica); // CHAMADA FUNÇÃO
                     break;
            case 2: m.FConsulta(estatistica); // CHAMADA PROCEDIMENTO
                    break;
            case 9:  JOptionPane.showMessageDialog(null,"Programa finalizado");
                     break;
            default: JOptionPane.showMessageDialog(null,"Opção Inválida");
         } // FECHA SWITCH
  }  // FECHA WHILE
 }   // FECHA METODO PRINCIPAL
}   // FECHA CLASSE PRINCIPAL


