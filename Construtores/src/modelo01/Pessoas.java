package modelo01;

public class Pessoas {

    private String nome;
    private int idade;
    private float altura; 
    private float peso;
    private String apelido;
    private boolean estaCadastrado;

    public Pessoas (String nome, int idade, float altura, float peso, String apelido, boolean estaCadastrado ){
        System.out.println("Uma pessoa acaba de Nascer! PARABENS!!!");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.apelido = apelido;
        this.estaCadastrado = estaCadastrado;
        
    }

    public void imprimirDados(){
    System.out.format("Nome: %s, Idade: %d, Altura: %.2fm, Peso: %.2fKg, Apelido: %s, Cadastrado: %s: ", nome, idade, altura, peso, apelido, estaCadastrado? "Sim":"Não");

    }
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
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
