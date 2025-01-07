package modelo02;

public class Produto {
    private String nome;
    private String marca;
    private float valor;

    Produto(){

    }

    Produto(String nome){
        this.nome = nome; 

    }

    Produto (String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    Produto (String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;

    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
