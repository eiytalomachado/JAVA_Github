package polimorfismo.polimorfismo2;

public class App {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        // Chamada do método falar sem parâmetros
        pessoa.falar();
        pessoa.falar("Olá, mundo!");
        pessoa.falar("Olá, mundo!", 42);

        Funcionario funcionario = new Funcionario();    
        funcionario.falar();
        funcionario.falar("Olá, funcionário!"); 
        funcionario.falar("Olá, funcionário!", 100);
            
        
    }

}
