package polimorfismo;
import polimorfismo.devflix.Filme;
import polimorfismo.devflix.Serie;

public class App {
    public static void main(String[] args) {

        Filme filme = new Filme("A Viagem de Chihiro");
        filme.play();
        filme.play("francês");
        filme.play("inglês", "japonês");

        Serie serie = new Serie("Game of Thrones", 2, 10);
        System.out.println(serie);
        serie.play(1, 15);
      

        
        }

}
