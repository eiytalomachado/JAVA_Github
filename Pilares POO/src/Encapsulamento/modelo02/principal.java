package Encapsulamento.modelo02;

public class principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();


        //MODIFICAR
        p.setnome("maria");
        p.setidade(23);

        //VIZUALIZAR
        System.out.println("O Nome da Pessoa é: " + p.getnome());
        System.out.println("A idade da Pessoa é: " + p.getidade());
    }
}  
 