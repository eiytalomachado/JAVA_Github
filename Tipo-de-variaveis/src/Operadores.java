public class Operadores {
    public static void main(String[] args) {
      int numeroUm = 1;
      int numeroDois = 2;
      
      boolean simNao = numeroUm == numeroDois;

      System.out.println("NúmeroUm é igual ao NúmeroDois? " + simNao);

      simNao = numeroUm != numeroDois;

      System.out.println("NúmeroUm é diferente ao NúmeroDois? " + simNao);

      simNao = numeroUm > numeroDois;

      System.out.println("NúmeroUm é maior ao NúmeroDois? " + simNao);

      simNao = numeroUm < numeroDois;

      System.out.println("NúmeroUm é maior ao NúmeroDois? " + simNao);
    }
}
