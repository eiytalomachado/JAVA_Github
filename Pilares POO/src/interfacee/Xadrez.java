package interfacee;

public class Xadrez implements Jogo {

    @Override
    public void fechar() {
        System.out.println("Fechando o jogo de Xadrez");
    }

    @Override
    public void jogar() {
        System.out.println("Jogando Xadrez");   
    }
    
}
