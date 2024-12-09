package modelo4;

public class AlunoTesta {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Ytalo machado");
        aluno1.setIdade(20);

        System.out.println("SEU NOME COMPLETO É " + aluno1.getNome());
        System.out.println("SUA IDADE É " + aluno1.getIdade());
        }
}
