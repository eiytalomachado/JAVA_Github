public class BoletimEscolar {
    public static void main(String[] args) {
        int mediaFinal = 50;
        
        if (mediaFinal < 6)
            System.out.println("Aluno reprovado");
        else if (mediaFinal == 6)
            System.out.println("Aluno em minerva");
        else
            System.out.println("Aluno Aprovado");
    }
    
}
