package modelo2;

public class User {

    // PROPRIEDADES (PRIVATE)
    private String firstName;
    private String lastName;

    // Alterar/Modificar --> setNomeVariavel
    // pegar --> getNomeVariavel


    // SETTER 
    public void setFirstName (String firstName){
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName (String lastName){
        this.lastName = lastName.toUpperCase();
    }

    // GETTER
    public String getfirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
