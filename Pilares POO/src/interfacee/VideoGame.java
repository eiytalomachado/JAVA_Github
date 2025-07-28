package interfacee;

public class VideoGame {
    private boolean estadoLigado; // falso por padrão
    private Jogo jogo; // null por padrão

    public void ligar() {
        System.out.println("Ligando o Video Game...");
        this.estadoLigado = true;
    }

public void jogar(Jogo jogo) {
    if (estadoLigado == true) {
        System.out.println("Jogando no Video Game...");
        this.jogo = jogo;
        jogo.jogar();
    } else {
        System.out.println("O Video Game está desligado. Ligue-o primeiro.");
    }
}

    public void desligar() {
       if (estadoLigado == true) {
            System.out.println("Desligando o Video Game...");
            boolean temJogoRodando = jogo != null;
            if (temJogoRodando) {
                jogo.fechar();
                jogo = null; // Limpa o jogo após fechar
            } else {
                System.out.println("Nenhum jogo está rodando.");
            }
        } else {
            System.out.println("O Video Game já está desligado.");
        }
    }
}


