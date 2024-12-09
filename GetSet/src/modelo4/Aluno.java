package modelo4;

public class Aluno {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 130) {
            this.idade = idade;
        } else {
          System.err.println("Erro: Idade inválida! Deve ser entre 0 e 130.");
         }
    }

    public int getIdade() {
        return idade;

    }
}
