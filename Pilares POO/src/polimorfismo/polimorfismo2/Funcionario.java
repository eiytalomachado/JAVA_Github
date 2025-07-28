package polimorfismo.polimorfismo2;

public class Funcionario extends Pessoa {

    @Override
    public void falar() {
        System.out.println("Funcionário falando");
    }

    @Override
    public void falar(String mensagem) {
        System.out.println("Funcionário falando: " + mensagem);
    }

    @Override
    public void falar(String mensagem, int numero) {
        System.out.println("Funcionário falando: " + mensagem + " " + numero);
    }
    
}
