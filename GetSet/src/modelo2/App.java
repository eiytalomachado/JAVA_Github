package modelo2;

public class App {
    public static void main(String[] args) {
    
    // Alterar/Modificar --> setNomeVariavel
    // pegar --> getNomeVariavel

    User userA = new User();
    userA.setFirstName("gabriel ");
    userA.setLastName("machado");

    System.out.println(userA.getfirstName() + userA.getLastName());


    User userB = new User();
    userB.setFirstName("joão ");
    userB.setLastName("pedro");
    System.out.println(userB.getfirstName() + userA.getLastName());

    }


}

