package abstracao;

public class MainAbstracao {

    public static void main(String[] args) {
    
        Fusca fusca = new Fusca();
        fusca.correr();
        fusca.parar();
        fusca.devagar();
        
        System.out.println("-----------------");

        Ferrari ferrari = new Ferrari();
        ferrari.correr();   
        ferrari.parar();
        ferrari.rapido();
        
        

       

    }
}

    