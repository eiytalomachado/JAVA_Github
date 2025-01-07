package modelo03;

public class Professor {

    private String nome;
    private int cpf;
    
    public Professor(){
        nome = "";
        cpf = 0;
    }

    public Professor(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

}

