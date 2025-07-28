package herança.animais;

public class Pombo extends Animal {
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        this.cartasEnviadas = 10;
    }

    public void voar() {
        System.out.printf("%s está voando\n", getNome());
    }

    public void fazerPrun() {
        System.out.printf("%s está fazendo pruuuuuuuuuuum\n", getNome());
    }

    public void enviarCarta() {
        System.out.println(getNome() + " está enviando uma carta.");
        cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
}