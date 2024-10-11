public class app {
    public static void main(String[] args) {
        personagem  heroi = new personagem();

        heroi.nome = "hercules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrarStatus();   
        // chamei um metood atacar e passsei como argumento uma string hydra"
        heroi.atacar("hydra");  
    

}

    
}