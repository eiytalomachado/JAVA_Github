package polimorfismo.devflix;

public class Serie extends Filme {
    private int temporadas;
    private int episodiosPorTemporada;  
    private int temporadasAtual;
    private int episodioAtual;
    
    public Serie(String nome, int temporadas, int episodiosPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadasAtual = 1;   
        this.episodioAtual = 1; 
    }

    public void play(int temporada, int episodio) { 
       this.temporadasAtual = temporada;
       this.episodioAtual = episodio;
       System.out.println("Play: " + toString());
    }

    // OS MÉTODOS ESPECÍFICOS DA CLASSE 
    @Override
   
    public String toString() {
        String informacao = String.format("Série: %s %dx%02d (audio %s, legenda %s)", getNome(), getTemporadasAtual(), getEpisodioAtual(), getAudio(), getLegenda());
        return informacao;
    }




    // OS MÊTODOS GETTERS E SETTERS
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadasAtual() {
        return temporadasAtual;
    }

    public void setTemporadasAtual(int temporadasAtual) {
        this.temporadasAtual = temporadasAtual;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

    
    
}
