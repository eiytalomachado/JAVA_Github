package interfacee;

public class PingPong implements Jogo {

    @Override
    public void fechar() {
        System.out.println("Fechando o jogo de Ping Pong.");
    }

    @Override
    public void jogar() {
        System.out.println("Jogando Ping Pong!");
    }

}
