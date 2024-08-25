import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       selecaoCanditados();
    }
    static void selecaoCanditados () {
         String [] canditados = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOSE" };

         int canditadosSelecionados = 0;
         int canditadosAtual = 0;
         double  salarioBase = 2000.0;
         while (canditadosSelecionados < 5 && canditadosAtual < canditados.length) {
            String canditato = canditados[canditadosAtual];
            double salarioPretendido = valorPretendido ();

            System.out.println("O canditato " + canditato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase  >= salarioPretendido) {
                System.out.println("O canditato " + canditato + " Foi selecionado para vaga") ;
                canditadosSelecionados++;
            }   
            canditadosAtual++;
         }
    }

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1, 15);

    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDITATO COM CONTRA PROPOSTA");
        }else{ 
            System.out.println("AGUARDANDO OS DEMAIS CANTIDATOS");
        }
    }
}
