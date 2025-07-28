package encapsulamento;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // alterar -> setNomeVariavel
        // pegar -> getNomeVariavel

        pessoa.setNome("bob esponja");
        pessoa.setIdade(20);
        pessoa.setAltura(1.75);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
    }
}
