
package atividade;


public class Atividade {

   
    public static void main(String[] args) 
    {
        Aluno AlunoI = new Aluno();
        AlunoI.nome = "Rogerio";
        AlunoI.notaBimestral1 = 6.5f;
        AlunoI.notaBimestral2 = 7.5f;
        AlunoI.Media();
        AlunoI.Ponderada();
        AlunoI.Situacao();
        
        Aluno AlunoII = new Aluno();
        AlunoII.nome = "Jose";
        AlunoII.notaBimestral1 = 5f;
        AlunoII.notaBimestral2 = 5.5f;
        AlunoII.Media();
        AlunoII.Ponderada();
        AlunoII.Situacao();
        
    }
   
    
}
