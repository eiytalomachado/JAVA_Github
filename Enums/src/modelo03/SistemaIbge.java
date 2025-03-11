package modelo03;

public class SistemaIbge {
    public static void main(String[] args) {
        //or(EstadoBrasileiro estado : EstadoBrasileiro.values()){
           // System.err.println(estado.getSigla() + " - " + estado.getNomecompleto());
        //}

        EstadoBrasileiro eb = EstadoBrasileiro.RIO_JANERO;
            System.out.println(eb.getSigla());
            System.out.println(eb.getNomecompleto());
            System.out.println(eb.getNomeMaiusculo());
            System.out.println(eb.getibge());


    }
}
