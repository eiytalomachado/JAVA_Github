package encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

        // alterar -> setNomeVarivavel
        // pegar -> getNomeVariavel


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
