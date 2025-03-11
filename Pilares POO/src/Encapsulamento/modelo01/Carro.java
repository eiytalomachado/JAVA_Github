package Encapsulamento.modelo01;

public class Carro {
   public void ligar(){
      System.out.println("Carro ligar");
      ConfereCambio();
      ConfereCombustivel();
   }

   private void ConfereCombustivel(){
    System.out.println("Conferindo Combústivel");
   }

   private void ConfereCambio(){
      System.out.println("Conferindo câmbio em P");
   }
}

