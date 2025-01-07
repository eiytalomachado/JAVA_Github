package modelo01;

public class Personagem {
    // Atributos da classe,,
    private String nome;
    private int nivel;
    private int força;
    private int vida;
    private String classe;

    // Método construtor
    public Personagem (String nome, String classe){
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 5000;
        if(classe.equals("forte")){
            força = nivel * 2;
        } else {
            força = nivel;
        }
    }
    // Métodos especificos
     public void mostrarStatus(){
        System.out.format("Nome %s\nNivel: %d\nVida: %d\nClasse: %s\nForça: %d ", nome, nivel, vida, classe, força);
    
    
    }


    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getForça() {
        return força;
    }
    public void setForça(int força) {
        this.força = força;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
}
