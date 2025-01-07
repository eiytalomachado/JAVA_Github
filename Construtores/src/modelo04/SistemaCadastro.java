package modelo04;

public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa ytalo = new Pessoa("05654654", "YTalo machado");

        ytalo.setEndereco("Rua das almoras");

        System.out.println(ytalo.getCpf() + " - " + ytalo.getNome() + " - " +ytalo.getEndereco());
    
    }
}
