public class ResultadoEscolar01 {
    public static void main(String[] args) {
        int nota = 5;

        String resultado = nota >=7 ? "Aprovado" : nota>5 && nota <7 ? "Recuperação" : "REPROVADO";

        System.out.println(resultado);
    }
    
}
