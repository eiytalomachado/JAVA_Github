package modelo3;

public class Futebol {
    private String nomeTime;

    // Alterar/Modificar --> setNomeVariavel
    // Pegar/Obter --> getNomeVariavel
        
    public void setNomeTime(String meuTime) {
        this.nomeTime = meuTime;
        
    }
    public String getNomeTime() {
        return nomeTime;
    }
    public void mostrarTime(){
        System.out.println("Seu time do coraçaõ é " + getNomeTime());
    }

    
}
