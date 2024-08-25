import java.util.Scanner;

public class PlanoTelefonico01 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.println("------------ESCOLHA UM DOS PLAOS TELEFONICOS ABAIXO------------");
        System.out.println("B - BÁSICO");
        System.out.println("M - MEGA");
        System.out.println("T - TURBO");
        System.out.println("Digite ums dos planos aicma");

        String plano = scanner.nextLine();
        
        switch (plano) {
            case "B":{
                System.out.println("100 Minutos de ligação");
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
