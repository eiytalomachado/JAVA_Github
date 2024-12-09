package modelo5;

public class Escola {
     public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Ytalo machado");
        aluno.setIdade(18);

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos");
    }
}
