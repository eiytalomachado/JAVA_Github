package herança.animais;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    
    }

    public void comer(){
        System.out.printf("%s está comendo\n", nome);
    }


    public void beber(){
        System.out.printf("%s está bebendo\n", nome);
    }


    public String getNome() {
        return nome;
    }

    
}
