public class carro {
    
    String nome;
    String marca;
    int anoFrabricacao;
    int velocidade;
     
    void acelerar (int aceleracao){
    velocidade+=aceleracao;
    }

    void reduzir (int reducao){
    velocidade-=reducao;
    }

    void buzinar (){
        System.out.println("bibibi");
    }

}

