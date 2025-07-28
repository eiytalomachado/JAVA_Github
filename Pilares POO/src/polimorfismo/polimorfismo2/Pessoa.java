package polimorfismo.polimorfismo2;

public class Pessoa {
    
    public void falar() {
        System.out.println("Pessoa falando");
    }

    public void falar(String mensagem) {
        System.out.println("Pessoa falando: " + mensagem);
    }   

    public void falar(String mensagem, int numero) {
        System.out.println("Pessoa falando: " + mensagem + " " + numero);
    }
}
