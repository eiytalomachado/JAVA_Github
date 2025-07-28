package herança.animais;

public class Dragao extends Animal {

    public Dragao(String nome) {
        super(nome);
        }

    public void respirarFogo() {
        System.out.printf("%s está respirando fogo\n", getNome());
    }

    public void voar() {
        System.out.printf("%s está voando\n", getNome());
    }
}