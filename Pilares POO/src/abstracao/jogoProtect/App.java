package abstracao.jogoProtect;
public class App {

    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.atacar();     
        guerreiro.atacar();     
        guerreiro.atacar();     
        guerreiro.atacar();     
        guerreiro.atacar();     
        guerreiro.atacar();     
        System.out.println(guerreiro.rolarDado() + " - Valor do dado rolado pelo Guerreiro.");
        
    }
}