package herança;

import herança.animais.Cachorro;
import herança.animais.Dragao;
import herança.animais.Gato;
import herança.animais.Pombo;

public class App {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Rex");
        
        // Comportamentos específicos do Cachorro
        cachorro.latir();
        cachorro.lamber();      
       
        Gato gato = new Gato("Felina");

        // Comportamentos específicos do Gato
        gato.miar();

        Dragao dragao = new Dragao("Fúria");
        
        // Comportamentos específicos do Dragão
        dragao.voar();
        dragao.respirarFogo();

        Pombo pombo = new Pombo ("Pombinho");
        // Comportamentos específicos do Pombo  
        pombo.enviarCarta();
        pombo.fazerPrun();
        System.out.println(pombo.getCartasEnviadas());    
    
    }
}
