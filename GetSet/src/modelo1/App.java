package modelo1; 

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();

        // Alturar/Modificar --> setNomeVariavel
        // pegar --> getNomeVariavel
        
        p1.setNome("Ytalo machado");
        System.out.println(p1.getNome());

        p1.setIdade(15);
        System.out.println(p1.getIdade());

        p1.setAltura(0);
        System.out.println(p1.getAltura());
    }

}
 