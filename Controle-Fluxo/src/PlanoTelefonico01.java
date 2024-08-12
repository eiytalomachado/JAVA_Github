public class PlanoTelefonico01 {
    public static void main(String[] args) {
        String plano = "A";
        switch (plano) {
            case "B":{
                System.out.println("100Minutos de ligação");
                break;
            }
            
             case "M":{
                System.out.println("100Minutos de ligaçao");
                System.out.println("whatsApp e instragam grátis");
               break;
             }

             case "T":{
                System.out.println("100Minutos de ligaçao");
                System.out.println("whatsApp e instragam grátis");
                System.out.println("5Gb de youtube");
                break;
             }
             
             default:
                System.out.println("Tamanho Indefinido");
        }
    }
}
