package Encapsulamento.modelo03;

public class Futebol {

    private String nomeTime;

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getNomeTime() {
        return nomeTime;
    }
    
    public void mostrarTime(){
        System.out.println("Seu time do coração é "+ getNomeTime ());
    }

   
    
    
}
