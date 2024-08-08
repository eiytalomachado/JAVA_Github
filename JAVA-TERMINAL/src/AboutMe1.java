public class AboutMe1 {
    public static void main(String[] args) throws Exception {
        
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);
        Double largura = Double.valueOf (args [4]);
        
        System.out.println( "Olá, me chamo " + nome + " " + sobrenome);
        System.out.println( "Tenho " + idade + " anos" );
        System.out.println( "Minha altura é " + altura + " cm ");
        System.out.println("e " + largura + " de largura!");




    }
}
