package interfacee;

public class App {
    public static void main(String[] args) {

        VideoGame xbox = new VideoGame();
        
        PingPong pingPong = new PingPong();

        xbox.ligar();
        xbox.jogar(pingPong);   
        xbox.desligar();
        System.out.println("---------------------");

        Xadrez xadrez = new Xadrez();   
        xbox.ligar();
        xbox.jogar(xadrez);
        xbox.desligar();
        System.out.println("---------------------");
        
        TiroAoAlvoOnline tiroAoAlvoOnline = new TiroAoAlvoOnline();
        xbox.ligar();
        xbox.jogar(tiroAoAlvoOnline);
        xbox.desligar();
        System.out.println("---------------------");


    }
}
