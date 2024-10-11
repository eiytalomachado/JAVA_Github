public class personagem {
    String nome;
    int nivel;
    int forca;

    // void ---> siginifca que não está retornando nada
    void mostrarStatus(){
        System.out.format("Personagem: %s (LVL %d) com %d de forca.\n", nome, nivel, forca);

    }

    // método que não retorna cada e recebe um parâmetro alvo que é do tipo String
    void atacar(String alvo){
        System.out.format("%s atacou %s de dano e causou %d de dano\n", nome, alvo, forca);  
  }
    
}
