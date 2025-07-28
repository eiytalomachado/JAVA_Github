package abstracao.jogoProtect;
import java.util.Random;

public abstract class Personagem {
    
    public abstract void atacar();
    
    protected int rolarDado(){
        Random  gerador = new Random();
        int numero = gerador.nextInt(6) + 1; // Gera um número entre 1 e 6
        return numero;

    }

}
