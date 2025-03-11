package modelo02;

public class EnumsMain {       
    
    public static void main(String[] args) {
    
    // LISTAR OS VALORES DA ENUM
    for(EnumPlanetas planetas : EnumPlanetas.values()) {
     System.out.println("O planeta é: " + planetas);   
    }
    
    }

}

